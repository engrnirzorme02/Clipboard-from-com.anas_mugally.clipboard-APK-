package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgn extends zzfs {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgn() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i7, int i8) throws zzgm {
        if (i8 == 0) {
            return 0;
        }
        long j7 = this.zzc;
        if (j7 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            String str = zzeo.zza;
            int i9 = randomAccessFile.read(bArr, i7, (int) Math.min(j7, i8));
            if (i9 > 0) {
                this.zzc -= (long) i9;
                zzh(i9);
            }
            return i9;
        } catch (IOException e7) {
            throw new zzgm(e7, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzgm {
        Uri uri = zzgeVar.zza;
        this.zzb = uri;
        zzf(zzgeVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                long j7 = zzgeVar.zze;
                randomAccessFile.seek(j7);
                long length = zzgeVar.zzf;
                if (length == -1) {
                    length = this.zza.length() - j7;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new zzgm(null, null, 2008);
                }
                this.zzd = true;
                zzg(zzgeVar);
                return this.zzc;
            } catch (IOException e7) {
                throw new zzgm(e7, 2000);
            }
        } catch (FileNotFoundException e8) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgm(e8, ((e8.getCause() instanceof ErrnoException) && ((ErrnoException) e8.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new zzgm(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e8, 1004);
        } catch (SecurityException e9) {
            throw new zzgm(e9, 2006);
        } catch (RuntimeException e10) {
            throw new zzgm(e10, 2000);
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
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzi();
                }
            } catch (IOException e7) {
                throw new zzgm(e7, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzi();
            }
            throw th;
        }
    }
}
