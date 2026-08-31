package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgg implements zzga {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzga zzc;
    private zzga zzd;
    private zzga zze;
    private zzga zzf;
    private zzga zzg;
    private zzga zzh;
    private zzga zzi;
    private zzga zzj;
    private zzga zzk;

    public zzgg(Context context, zzga zzgaVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzgaVar;
    }

    private final zzga zzf() {
        if (this.zze == null) {
            zzfr zzfrVar = new zzfr(this.zza);
            this.zze = zzfrVar;
            zzg(zzfrVar);
        }
        return this.zze;
    }

    private final void zzg(zzga zzgaVar) {
        int i7 = 0;
        while (true) {
            List list = this.zzb;
            if (i7 >= list.size()) {
                return;
            }
            zzgaVar.zze((zzgy) list.get(i7));
            i7++;
        }
    }

    private static final void zzh(zzga zzgaVar, zzgy zzgyVar) {
        if (zzgaVar != null) {
            zzgaVar.zze(zzgyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i7, int i8) {
        zzga zzgaVar = this.zzk;
        zzgaVar.getClass();
        return zzgaVar.zza(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) {
        zzga zzgaVar;
        zzghc.zzh(this.zzk == null);
        Uri uri = zzgeVar.zza;
        String scheme = uri.getScheme();
        String str = zzeo.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzgn zzgnVar = new zzgn();
                    this.zzd = zzgnVar;
                    zzg(zzgnVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzf();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzf();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzfx zzfxVar = new zzfx(this.zza);
                this.zzf = zzfxVar;
                zzg(zzfxVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzga zzgaVar2 = (zzga) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzgaVar2;
                    zzg(zzgaVar2);
                } catch (ClassNotFoundException unused) {
                    zzds.zzc("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating RTMP extension", e7);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzha zzhaVar = new zzha(2000);
                this.zzh = zzhaVar;
                zzg(zzhaVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzfy zzfyVar = new zzfy();
                this.zzi = zzfyVar;
                zzg(zzfyVar);
            }
            this.zzk = this.zzi;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzgw zzgwVar = new zzgw(this.zza);
                    this.zzj = zzgwVar;
                    zzg(zzgwVar);
                }
                zzgaVar = this.zzj;
            } else {
                zzgaVar = this.zzc;
            }
            this.zzk = zzgaVar;
        }
        return this.zzk.zzb(zzgeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        zzga zzgaVar = this.zzk;
        if (zzgaVar == null) {
            return null;
        }
        return zzgaVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() {
        zzga zzgaVar = this.zzk;
        if (zzgaVar != null) {
            try {
                zzgaVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zze(zzgy zzgyVar) {
        zzgyVar.getClass();
        this.zzc.zze(zzgyVar);
        this.zzb.add(zzgyVar);
        zzh(this.zzd, zzgyVar);
        zzh(this.zze, zzgyVar);
        zzh(this.zzf, zzgyVar);
        zzh(this.zzg, zzgyVar);
        zzh(this.zzh, zzgyVar);
        zzh(this.zzi, zzgyVar);
        zzh(this.zzj, zzgyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzga, com.google.android.gms.internal.ads.zzgt
    public final Map zzj() {
        zzga zzgaVar = this.zzk;
        return zzgaVar == null ? Collections.EMPTY_MAP : zzgaVar.zzj();
    }
}
