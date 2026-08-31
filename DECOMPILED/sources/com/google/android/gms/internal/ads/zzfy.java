package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfy extends zzfs {
    private zzge zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfy() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        int i9 = this.zzd;
        if (i9 == 0) {
            return -1;
        }
        int iMin = Math.min(i8, i9);
        byte[] bArr2 = this.zzb;
        String str = zzeo.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i7, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzgb, zzas {
        zzf(zzgeVar);
        this.zza = zzgeVar;
        Uri uriNormalizeScheme = zzgeVar.zza.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzghc.zzf("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = zzeo.zza;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw zzas.zza("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e7) {
                throw zzas.zza("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e7);
            }
        } else {
            this.zzb = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j7 = zzgeVar.zze;
        int length = this.zzb.length;
        if (j7 > length) {
            this.zzb = null;
            throw new zzgb(2008);
        }
        int i7 = (int) j7;
        this.zzc = i7;
        int i8 = length - i7;
        this.zzd = i8;
        long j8 = zzgeVar.zzf;
        if (j8 != -1) {
            this.zzd = (int) Math.min(i8, j8);
        }
        zzg(zzgeVar);
        return j8 != -1 ? j8 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        zzge zzgeVar = this.zza;
        if (zzgeVar != null) {
            return zzgeVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzi();
        }
        this.zza = null;
    }
}
