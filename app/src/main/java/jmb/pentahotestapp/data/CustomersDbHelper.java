package jmb.pentahotestapp.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static jmb.pentahotestapp.data.CustomersContract.CustomerEntry;

/**
 * Created by jmbalbas on 29/09/2016.
 */

public class CustomersDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "PentahoTest.db";

    /**
     * Constructor
     *
     * @param context
     */
    public CustomersDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Crear la table customers
        db.execSQL("CREATE TABLE " + CustomerEntry.TABLE_NAME + " ("
                + CustomerEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + CustomerEntry.ID + " INTEGER NOT NULL,"
                + CustomerEntry.NAME + " TEXT NOT NULL,"
                + CustomerEntry.SURNAMES + " TEXT NOT NULL,"
                + CustomerEntry.ADDRESS + " TEXT,"
                + CustomerEntry.POSTAL_CODE + " TEXT,"
                + CustomerEntry.CITY + " TEXT,"
                + CustomerEntry.STATE + " TEXT,"
                + CustomerEntry.COUNTRY + " TEXT,"
                + CustomerEntry.IDENTITY_DOCUMENT + " TEXT,"
                + CustomerEntry.PHONE_NUMBER + " TEXT,"
                + CustomerEntry.MOBILE_NUMBER + " TEXT,"
                + CustomerEntry.FAX + " TEXT,"
                + CustomerEntry.EMAIL + " TEXT,"
                + CustomerEntry.WEB + " TEXT,"
                + "UNIQUE (" + CustomerEntry.ID + "))");

        mockData(db);

        /*
        // Contenedor de valores
        ContentValues values = new ContentValues();

        // Pares clave-valor
        values.put(CustomerEntry.ID, 1);
        values.put(CustomerEntry.NAME, "Jose Manuel");
        values.put(CustomerEntry.SURNAMES, "Balbás Muriel");
        values.put(CustomerEntry.ADDRESS, "C/ Prueba S/N");
        values.put(CustomerEntry.POSTAL_CODE, "39001");
        values.put(CustomerEntry.CITY, "Santander");
        values.put(CustomerEntry.STATE, "Cantabria");
        values.put(CustomerEntry.COUNTRY, "España");
        values.put(CustomerEntry.IDENTITY_DOCUMENT, "00000000A");
        values.put(CustomerEntry.PHONE_NUMBER, "942000000");
        values.put(CustomerEntry.MOBILE_NUMBER, "600000000");
        values.put(CustomerEntry.FAX, "942000001");
        values.put(CustomerEntry.EMAIL, "jmbalbas87@gmail.com");
        values.put(CustomerEntry.WEB, "https://github.com/balbas");

        // Insertar registro
        db.insert(CustomerEntry.TABLE_NAME, null, values);
        */
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // No hay operaciones
    }

    private void mockData(SQLiteDatabase sqLiteDatabase) {
        mockCustomer(sqLiteDatabase, new Customer("Jose Manuel", "Balbás Muriel", "C/ Prueba S/N", "39001", "Santander", "Cantabria", "España", "00000000A", "942000000", "600000000", "942000001", "jmbalbas87@gmail.com", "https://github.com/balbas"));
    }

    public long mockCustomer(SQLiteDatabase db, Customer customer) {
        return db.insert(CustomerEntry.TABLE_NAME, null, customer.toContentValues());
    }

    public Cursor getAllCustomers() {
        return getReadableDatabase().query(CustomerEntry.TABLE_NAME, null, null, null, null, null, null);
    }

    public Cursor getCustomerById(String customerId) {
        Cursor c = getReadableDatabase().query(CustomerEntry.TABLE_NAME, null, CustomerEntry.ID + " LIKE ?", new String[] { customerId }, null, null, null);
        return c;
    }

    public int deleteCustomer(String customerId) {
        return getWritableDatabase().delete(CustomerEntry.TABLE_NAME, CustomerEntry.ID + " LIKE ?", new String[] { customerId });
    }

    public int updateLawyer(Customer customer, String customerId) {
        return getWritableDatabase().update(CustomerEntry.TABLE_NAME, customer.toContentValues(), CustomerEntry.ID + " LIKE ?", new String[] { customerId });
    }
}
