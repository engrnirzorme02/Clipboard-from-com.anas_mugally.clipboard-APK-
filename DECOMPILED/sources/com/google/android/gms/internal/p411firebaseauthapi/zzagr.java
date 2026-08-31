package com.google.android.gms.internal.p411firebaseauthapi;

/* JADX INFO: loaded from: classes2.dex */
final class zzagr extends zzaih {
    private String zza;
    private String zzb;
    private String zzc;
    private zzahg zzd;
    private String zze;

    zzagr() {
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaih
    public final zzaih zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null idToken");
        }
        this.zze = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaih
    public final zzaih zzb(String str) {
        if (str == null) {
            throw new NullPointerException("Null providerId");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaih
    public final zzaih zzc(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaih
    public final zzaih zzd(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaih
    public final zzaih zza(zzahg zzahgVar) {
        if (zzahgVar != null) {
            this.zzd = zzahgVar;
            return this;
        }
        throw new NullPointerException("Null tokenType");
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaih
    public final zzaie zza() {
        String str;
        zzahg zzahgVar;
        String str2;
        String str3 = this.zza;
        if (str3 != null && (str = this.zzc) != null && (zzahgVar = this.zzd) != null && (str2 = this.zze) != null) {
            return new zzago(str3, this.zzb, str, zzahgVar, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" providerId");
        }
        if (this.zzc == null) {
            sb.append(" token");
        }
        if (this.zzd == null) {
            sb.append(" tokenType");
        }
        if (this.zze == null) {
            sb.append(" idToken");
        }
        throw new IllegalStateException("Missing required properties:" + String.valueOf(sb));
    }
}
