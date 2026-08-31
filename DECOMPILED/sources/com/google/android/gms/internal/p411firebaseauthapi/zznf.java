package com.google.android.gms.internal.p411firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class zznf implements zzby {
    private final SharedPreferences.Editor zza;
    private final String zzb;

    public zznf(Context context, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        this.zzb = str;
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.zza = PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            this.zza = applicationContext.getSharedPreferences(str2, 0).edit();
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzby
    public final void zza(zzvv zzvvVar) throws IOException {
        if (!this.zza.putString(this.zzb, zzzx.zza(zzvvVar.zzk())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzby
    public final void zza(zzxh zzxhVar) throws IOException {
        if (!this.zza.putString(this.zzb, zzzx.zza(zzxhVar.zzk())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
