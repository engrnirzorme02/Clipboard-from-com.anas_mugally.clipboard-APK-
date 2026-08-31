package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.C3431F0;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import java.util.Iterator;
import java.util.Map;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbxs {
    static zzbxs zzi;

    public static synchronized zzbxs zzb(Context context) {
        try {
            zzbxs zzbxsVar = zzi;
            if (zzbxsVar != null) {
                return zzbxsVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbci.zza(applicationContext);
            InterfaceC3494q0 interfaceC3494q0Zzo = C7351t.m32354l().zzo();
            interfaceC3494q0Zzo.zza(applicationContext);
            zzbxm zzbxmVar = new zzbxm(null);
            zzbxmVar.zza(applicationContext);
            zzbxmVar.zzb(C7351t.m32357o());
            zzbxmVar.zzc(interfaceC3494q0Zzo);
            zzbxmVar.zzd(C7351t.m32346d());
            zzbxs zzbxsVarZze = zzbxmVar.zze();
            zzi = zzbxsVarZze;
            ((zzbxg) ((zzbxn) zzbxsVarZze).zzc.zzb()).zza();
            final zzbxx zzbxxVar = (zzbxx) ((zzbxn) zzi).zzh.zzb();
            if (((Boolean) C3250D.m17200c().zzd(zzbci.zzaK)).booleanValue()) {
                C7351t.m32349g();
                final Map mapM17419j0 = C3431F0.m17419j0((String) C3250D.m17200c().zzd(zzbci.zzaL));
                Iterator it = mapM17419j0.keySet().iterator();
                while (it.hasNext()) {
                    zzbxxVar.zzb((String) it.next());
                }
                zzbxxVar.zza(new zzbxv() { // from class: com.google.android.gms.internal.ads.zzbxw
                    @Override // com.google.android.gms.internal.ads.zzbxv
                    public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                        zzbxxVar.zzc(mapM17419j0, sharedPreferences, str, str2);
                    }
                });
            }
            return zzi;
        } catch (Throwable th) {
            throw th;
        }
    }

    abstract zzbxk zza();
}
