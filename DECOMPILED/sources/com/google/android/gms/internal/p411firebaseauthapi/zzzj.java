package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.internal.p411firebaseauthapi.zzzp;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes2.dex */
public final class zzzj<T_WRAPPER extends zzzp<JcePrimitiveT>, JcePrimitiveT> {
    public static final zzzj<zzzs, Cipher> zza = new zzzj<>(new zzzs());
    public static final zzzj<zzzw, Mac> zzb = new zzzj<>(new zzzw());
    public static final zzzj<zzzr, KeyAgreement> zzc;
    public static final zzzj<zzzt, KeyPairGenerator> zzd;
    public static final zzzj<zzzu, KeyFactory> zze;
    private final zzzn<JcePrimitiveT> zzf;

    static {
        new zzzj(new zzzy());
        new zzzj(new zzzv());
        zzc = new zzzj<>(new zzzr());
        zzd = new zzzj<>(new zzzt());
        zze = new zzzj<>(new zzzu());
    }

    private zzzj(T_WRAPPER t_wrapper) {
        if (zziv.zzb()) {
            this.zzf = new zzzo(t_wrapper);
        } else if (zzaaf.zza()) {
            this.zzf = new zzzm(t_wrapper);
        } else {
            this.zzf = new zzzl(t_wrapper);
        }
    }

    public final JcePrimitiveT zza(String str) {
        return this.zzf.zza(str);
    }

    public static List<Provider> zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }
}
