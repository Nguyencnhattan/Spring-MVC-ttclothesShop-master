package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity{
	// ORM technique
//		@Id //notnull va primary 
//		@GeneratedValue(strategy = GenerationType.IDENTITY) // set autoincrement
//		private Long id;
		
		@Column(name = "username")
		private String userName;
		
		@Column(name = "password")
		private String passWord;

		@Column(name = "fullname")
		private String fullName;
		
		@Column(name = "status")
		private Integer  status;
		
		@Column(name = "address")
		private String address;
		
		@Column(name = "phone", length = 15)
		private String phone;
		
		@Column(name = "birthday")
		private Date birthday;
		
		
		//EAGER load bang phu len cung luc
		//lazy load sau (can congif)
		@ManyToMany
		@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "userid"),
				inverseJoinColumns = @JoinColumn(name = "roleid"))
		private List<RoleEntity> roles = new ArrayList<>();
		
		@OneToMany(mappedBy = "users")
		private List<OrderEntity> orders = new ArrayList<>();
		
		
		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public Date getBirthday() {
			return birthday;
		}

		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}

		public List<OrderEntity> getOrders() {
			return orders;
		}

		public void setOrders(List<OrderEntity> orders) {
			this.orders = orders;
		}

		public List<RoleEntity> getRoles() {
			return roles;
		}

		public void setRoles(List<RoleEntity> roles) {
			this.roles = roles;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassWord() {
			return passWord;
		}

		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}

		public String getFullName() {
			return fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public Integer getStatus() {
			return status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}
		
		
}