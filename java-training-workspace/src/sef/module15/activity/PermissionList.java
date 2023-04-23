package sef.module15.activity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PermissionList implements Permissable{
	
	private String permissionID;
	private Set<Permission> permission = new HashSet<Permission>();
	
	/**
	 * Creates a permission object and provides an identifier for it
	 * 
	 * @param permissionID
	 */
	public PermissionList(String permissionID){
		this.permissionID = permissionID;
	}


	/* (non-Javadoc)
	 * @see sef.module14.activity.Permissable#getPermission()
	 */
//	@Override
	public Set<Permission> getPermission() {

		return permission;
		
	}


	/* (non-Javadoc)
	 * @see sef.module14.activity.Permissable#removePermission(sef.module14.activity.Permission[])
	 */
//	@Override
	public void removePermission(Permission... permissions) {
		for (Permission p: permissions)
			permission.remove(p);
		
	}


	/* (non-Javadoc)
	 * @see sef.module14.activity.Permissable#setPermission(sef.module14.activity.Permission[])
	 */
//	@Override
	public void setPermission(Permission... permissions) {
		for (Permission p: permissions)
			permission.add(p);
		
	}


	/* (non-Javadoc)
	 * @see sef.module14.activity.Permissable#isPermissable(sef.module14.activity.Permission)
	 */
//	@Override
	public boolean isPermissable(Permission permission) {
		for (Permission p: this.permission)
			if (p.name().equals(permission.name()))
				return true;
		return false;
		
	}
}
