package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfr extends zzfs {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzfr(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i7, int i8) throws zzfq {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.zzd;
        if (j7 == 0) {
            return -1;
        }
        if (j7 != -1) {
            try {
                i8 = (int) Math.min(j7, i8);
            } catch (IOException e7) {
                throw new zzfq(e7, 2000);
            }
        }
        InputStream inputStream = this.zzc;
        String str = zzeo.zza;
        int i9 = inputStream.read(bArr, i7, i8);
        if (i9 == -1) {
            return -1;
        }
        long j8 = this.zzd;
        if (j8 != -1) {
            this.zzd = j8 - ((long) i9);
        }
        zzh(i9);
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzfq {
        try {
            Uri uri = zzgeVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzf(zzgeVar);
            InputStream inputStreamOpen = this.zza.open(path, 1);
            this.zzc = inputStreamOpen;
            long j7 = zzgeVar.zze;
            if (inputStreamOpen.skip(j7) < j7) {
                throw new zzfq(null, 2008);
            }
            long j8 = zzgeVar.zzf;
            if (j8 != -1) {
                this.zzd = j8;
            } else {
                long jAvailable = this.zzc.available();
                this.zzd = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.zzd = -1L;
                }
            }
            this.zze = true;
            zzg(zzgeVar);
            return this.zzd;
        } catch (zzfq e7) {
            throw e7;
        } catch (IOException e8) {
            throw new zzfq(e8, true != (e8 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzi();
                }
            } catch (IOException e7) {
                throw new zzfq(e7, 2000);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzi();
            }
            throw th;
        }
    }
}
