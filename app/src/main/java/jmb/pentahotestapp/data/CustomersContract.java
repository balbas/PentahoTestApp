package jmb.pentahotestapp.data;

import android.provider.BaseColumns;

/**
 * Created by jmbalbas on 29/09/2016.
 *
 * Esquema de la base de datos para clientes
 */

public class CustomersContract {
    /**
     * Clase abstracta
     */
    public static abstract class CustomerEntry implements BaseColumns {
        public static final String TABLE_NAME ="costumers";

        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String SURNAMES = "surnames";
        public static final String ADDRESS = "address";
        public static final String POSTAL_CODE = "postalCode";
        public static final String CITY = "city";
        public static final String STATE = "state";
        public static final String COUNTRY = "country";
        public static final String IDENTITY_DOCUMENT = "identityDocument";
        public static final String PHONE_NUMBER = "phoneNumber";
        public static final String MOBILE_NUMBER = "mobileNumber";
        public static final String FAX = "fax";
        public static final String EMAIL = "email";
        public static final String WEB = "web";
    }
}
