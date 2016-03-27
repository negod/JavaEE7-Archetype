/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.negod.archetype.dao;

import com.negod.archetype.entity.Account;
import com.negod.archetype.exception.DaoException;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author joaki
 */
@LocalBean
@Stateless
public class AccountDao extends GenericDao<Account> {

    public AccountDao() throws DaoException {
        super(Account.class);
    }

    @Override
    public void delete(String externalId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
