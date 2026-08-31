package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.internal.util.InterfaceC3452Q;
import com.google.android.gms.dynamic.BinderC3773b;
import java.util.concurrent.Callable;
import p380w2.C7351t;
import p404z2.C7605v;

/* JADX INFO: loaded from: classes2.dex */
public final class zzecn extends zzfqp {
    private final Context zza;
    private final zzgpd zzb;

    public zzecn(Context context, zzgpd zzgpdVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) C3250D.m17200c().zzd(zzbci.zzje)).intValue(), zzfqr.zza);
        this.zza = context;
        this.zzb = zzgpdVar;
    }

    static /* synthetic */ Void zzf(C7605v c7605v, SQLiteDatabase sQLiteDatabase) throws Throwable {
        zzj(sQLiteDatabase, c7605v);
        return null;
    }

    static /* synthetic */ void zzg(SQLiteDatabase sQLiteDatabase, String str, C7605v c7605v) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, c7605v);
    }

    static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, C7605v c7605v) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        String string;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", "url"};
            StringBuilder sb = new StringBuilder(15);
            sb.append("event_state = ");
            sb.append(1);
            String string2 = sb.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", strArr, string2, null, null, null, "timestamp ASC", null);
                int count = cursorQuery.getCount();
                String[] strArr2 = new String[count];
                int i7 = 0;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex2 = cursorQuery.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j7 = cursorQuery.getLong(columnIndex);
                        String string3 = cursorQuery.getString(columnIndex2);
                        if (string3 == null) {
                            string = "";
                        } else {
                            Uri uri = Uri.parse(string3);
                            long jMo18159a = C7351t.m32357o().mo18159a() - j7;
                            String encodedQuery = uri.getEncodedQuery();
                            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                            builderClearQuery.appendQueryParameter("bd", Long.toString(jMo18159a));
                            String strValueOf = String.valueOf(builderClearQuery.build());
                            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length());
                            sb2.append(strValueOf);
                            sb2.append("&");
                            sb2.append(encodedQuery);
                            string = sb2.toString();
                        }
                        strArr2[i7] = string;
                    }
                    i7++;
                }
                cursorQuery.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i8 = 0; i8 < count; i8++) {
                    c7605v.zza(strArr2[i8]);
                }
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                sQLiteDatabase2.endTransaction();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final void zza(zzfgm zzfgmVar) {
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzecm
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.getWritableDatabase();
            }
        };
        zzgpd zzgpdVar = this.zzb;
        zzgot.zzq(zzgpdVar.submit(callable), new zzecg(this, zzfgmVar), zzgpdVar);
    }

    final void zzb(final SQLiteDatabase sQLiteDatabase, final C7605v c7605v, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzech
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws Throwable {
                zzecn.zzg(sQLiteDatabase, str, c7605v);
            }
        });
    }

    public final void zzc(final C7605v c7605v, final String str) {
        zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzeci
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                this.zza.zzb((SQLiteDatabase) obj, c7605v, str);
                return null;
            }
        });
    }

    public final void zzd(final String str) {
        zza(new zzfgm(this) { // from class: com.google.android.gms.internal.ads.zzecj
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                zzecn.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zze(final zzecp zzecpVar) {
        zza(new zzfgm() { // from class: com.google.android.gms.internal.ads.zzeck
            @Override // com.google.android.gms.internal.ads.zzfgm
            public final /* synthetic */ Object zza(Object obj) {
                this.zza.zzh(zzecpVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final /* synthetic */ Void zzh(zzecp zzecpVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzecpVar.zza));
        contentValues.put("gws_query_id", zzecpVar.zzb);
        contentValues.put("url", zzecpVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzecpVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        C7351t.m32349g();
        Context context = this.zza;
        InterfaceC3452Q interfaceC3452QM17406d = C3431F0.m17406d(context);
        if (interfaceC3452QM17406d != null) {
            try {
                interfaceC3452QM17406d.zzf(BinderC3773b.m18221N0(context));
            } catch (RemoteException e7) {
                AbstractC3490o0.m17546l("Failed to schedule offline ping sender.", e7);
            }
        }
        return null;
    }
}
