package com.users.ejb;

import java.util.List;
import java.util.UUID;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless(mappedName = "UserService")
public class RMenuServiceBean implements RMenuService {

	@PersistenceContext(unitName = "ejbpro1")
	private EntityManager manager;

	@Override
	public void Add(RMenu menu) {
		// TODO Auto-generated method stub

		menu.setId(UUID.randomUUID().toString());

		manager.persist(menu);

	}

	@Override
	public void Update(RMenu menu) {
		manager.merge(menu);
	}

	@Override
	public void Delete(String id) {
		RMenu menu = manager.find(RMenu.class, id);

		manager.remove(menu);
	}

	@Override
	public void Delete(String roleid, String menuid) {
		String sql = "delete from t_authority_rolemenu where FRoleID='"
				+ roleid + "' ";

		if (menuid != null && menuid.length() > 0) {
			sql = "delete from t_authority_rolemenu where FRoleID='" + roleid
					+ "' and FMenuID='" + menuid + "' ";
		}

		Query query = manager.createNativeQuery(sql);

		query.executeUpdate();
	}

	@Override
	public RMenu find(String id) {
		RMenu menu = manager.find(RMenu.class, id);
		return menu;
	}

	@Override
	public int GetUserCount() {

		String hql = "select count(*) from User";
		Query query = manager.createQuery(hql);
		int total = (new Integer(query.getSingleResult().toString()));
		return total;
	}

	@Override
	public List<RMenu> GetRMenuByRole(String roleid) {

		String hql = "from RMenu where froleid = '"+roleid+"'";
		Query query = manager.createQuery(hql);
		@SuppressWarnings("unchecked")
		List<RMenu> menus = query.getResultList();
		return menus;

	}

}
