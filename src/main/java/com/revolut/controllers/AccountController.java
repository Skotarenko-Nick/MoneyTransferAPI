package com.revolut.controllers;

import spark.Request;
import spark.Response;

public interface AccountController {

    String createAccount(Request request, Response response);

    String getAllAccounts(Request request, Response response);

    String getAcountById(Request request, Response response);

    String deleteAccountById(Request request, Response response);

    String createAccountTransaction(Request request, Response response) throws Exception;

    String getAllTransactionsOfAccount(Request request,Response response);
}
