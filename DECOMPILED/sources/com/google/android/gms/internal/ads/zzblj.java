package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import p157U3.InterfaceFutureC1673e;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzblj implements zzapa {
    private volatile zzbkw zza;
    private final Context zzb;

    public zzblj(Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzapa
    public final zzapd zza(zzaph zzaphVar) throws zzapq {
        Parcelable.Creator<zzbkx> creator = zzbkx.CREATOR;
        Map mapZzm = zzaphVar.zzm();
        int size = mapZzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i7 = 0;
        for (Map.Entry entry : mapZzm.entrySet()) {
            strArr[i7] = (String) entry.getKey();
            strArr2[i7] = (String) entry.getValue();
            i7++;
        }
        zzbkx zzbkxVar = new zzbkx(zzaphVar.zzh(), strArr, strArr2);
        long jMo18161c = C7351t.m32357o().mo18161c();
        try {
            zzbzm zzbzmVar = new zzbzm();
            this.zza = new zzbkw(this.zzb, C7351t.m32365w().m17489a(), new zzblh(this, zzbzmVar), new zzbli(this, zzbzmVar));
            this.zza.checkAvailabilityAndConnect();
            zzblf zzblfVar = new zzblf(this, zzbkxVar);
            zzgpd zzgpdVar = zzbzh.zza;
            InterfaceFutureC1673e interfaceFutureC1673eZzi = zzgot.zzi(zzgot.zzj(zzbzmVar, zzblfVar, zzgpdVar), ((Integer) C3250D.m17200c().zzd(zzbci.zzeV)).intValue(), TimeUnit.MILLISECONDS, zzbzh.zzd);
            interfaceFutureC1673eZzi.addListener(new zzblg(this), zzgpdVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) interfaceFutureC1673eZzi.get();
            long jMo18161c2 = C7351t.m32357o().mo18161c() - jMo18161c;
            StringBuilder sb = new StringBuilder(String.valueOf(jMo18161c2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(jMo18161c2);
            sb.append("ms");
            AbstractC3490o0.m17545k(sb.toString());
            zzbkz zzbkzVar = (zzbkz) new zzbut(parcelFileDescriptor).zza(zzbkz.CREATOR);
            if (zzbkzVar == null) {
                return null;
            }
            if (zzbkzVar.zza) {
                throw new zzapq(zzbkzVar.zzb);
            }
            String[] strArr3 = zzbkzVar.zze;
            String[] strArr4 = zzbkzVar.zzf;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap map = new HashMap();
            for (int i8 = 0; i8 < strArr3.length; i8++) {
                map.put(strArr3[i8], strArr4[i8]);
            }
            return new zzapd(zzbkzVar.zzc, zzbkzVar.zzd, map, zzbkzVar.zzg, zzbkzVar.zzh);
        } catch (InterruptedException | ExecutionException unused) {
            long jMo18161c3 = C7351t.m32357o().mo18161c() - jMo18161c;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jMo18161c3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jMo18161c3);
            sb2.append("ms");
            AbstractC3490o0.m17545k(sb2.toString());
            return null;
        } catch (Throwable th) {
            long jMo18161c4 = C7351t.m32357o().mo18161c() - jMo18161c;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jMo18161c4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jMo18161c4);
            sb3.append("ms");
            AbstractC3490o0.m17545k(sb3.toString());
            throw th;
        }
    }

    final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }

    final /* synthetic */ zzbkw zzc() {
        return this.zza;
    }
}
