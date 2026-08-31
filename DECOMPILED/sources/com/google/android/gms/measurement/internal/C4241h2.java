package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.zzby;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.h2 */
/* JADX INFO: loaded from: classes2.dex */
final class C4241h2 extends zzby {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C4249i2 f15792a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4241h2(C4249i2 c4249i2, Context context, String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        Objects.requireNonNull(c4249i2);
        this.f15792a = c4249i2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e7) {
            throw e7;
        } catch (SQLiteException unused) {
            C4164X2 c4164x2 = this.f15792a.f15066a;
            c4164x2.mo18421a().m18851o().m18834a("Opening the local database failed, dropping and recreating it");
            c4164x2.m18686w();
            if (!c4164x2.mo18424e().getDatabasePath("google_app_measurement_local.db").delete()) {
                c4164x2.mo18421a().m18851o().m18835b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e8) {
                this.f15792a.f15066a.mo18421a().m18851o().m18835b("Failed to open local database. Events will bypass local storage", e8);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC4350v.m19103b(this.f15792a.f15066a.mo18421a(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        AbstractC4350v.m19102a(this.f15792a.f15066a.mo18421a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", C4249i2.f15819e);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
    }
}
