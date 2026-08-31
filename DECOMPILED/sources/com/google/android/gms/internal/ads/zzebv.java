package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class zzebv {
    public static void zza(SQLiteDatabase sQLiteDatabase) {
        zzi(sQLiteDatabase, "failed_requests", 0);
        zzi(sQLiteDatabase, "total_requests", 0);
        zzi(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void zzb(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        zzh(sQLiteDatabase, "failed_requests", 0);
        zzh(sQLiteDatabase, "total_requests", 0);
        zzh(sQLiteDatabase, "completed_requests", 0);
    }

    public static int zzc(SQLiteDatabase sQLiteDatabase, int i7) {
        int i8 = 0;
        if (i7 == 2) {
            return 0;
        }
        Cursor cursorZzg = zzg(sQLiteDatabase, i7);
        if (cursorZzg.getCount() > 0) {
            cursorZzg.moveToNext();
            i8 = cursorZzg.getInt(cursorZzg.getColumnIndexOrThrow("value"));
        }
        cursorZzg.close();
        return i8;
    }

    public static long zzd(SQLiteDatabase sQLiteDatabase, int i7) {
        long j7;
        Cursor cursorZzg = zzg(sQLiteDatabase, 2);
        if (cursorZzg.getCount() > 0) {
            cursorZzg.moveToNext();
            j7 = cursorZzg.getLong(cursorZzg.getColumnIndexOrThrow("value"));
        } else {
            j7 = 0;
        }
        cursorZzg.close();
        return j7;
    }

    public static void zze(SQLiteDatabase sQLiteDatabase, long j7, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j7));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j7)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void zzf(SQLiteDatabase sQLiteDatabase, boolean z7, boolean z8) {
        if (!z8) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests"));
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
        if (z7) {
            return;
        }
        sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests"));
    }

    private static Cursor zzg(SQLiteDatabase sQLiteDatabase, int i7) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i7 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i7 == 1) {
            strArr2[0] = "total_requests";
        } else if (i7 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    private static void zzh(SQLiteDatabase sQLiteDatabase, String str, int i7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }

    private static void zzi(SQLiteDatabase sQLiteDatabase, String str, int i7) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }
}
