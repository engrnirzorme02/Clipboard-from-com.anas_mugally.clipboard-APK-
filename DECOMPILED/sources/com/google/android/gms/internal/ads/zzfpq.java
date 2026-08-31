package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.AbstractC3756k;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfpq {
    private final zzaxw zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfpq(zzaxw zzaxwVar, File file, File file2, File file3) {
        this.zza = zzaxwVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzaxw zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzb;
    }

    public final File zzc() {
        return this.zzc;
    }

    public final byte[] zzd() throws Throwable {
        FileInputStream fileInputStream;
        byte[] bArrZzv;
        FileInputStream fileInputStream2 = null;
        if (this.zze == null) {
            try {
                fileInputStream = new FileInputStream(this.zzd);
                try {
                    zzhhb zzhhbVar = zzhhb.zzb;
                    ArrayList arrayList = new ArrayList();
                    int iMin = 256;
                    while (true) {
                        byte[] bArr = new byte[iMin];
                        int i7 = 0;
                        while (i7 < iMin) {
                            int i8 = fileInputStream.read(bArr, i7, iMin - i7);
                            if (i8 == -1) {
                                break;
                            }
                            i7 += i8;
                        }
                        zzhhb zzhhbVarZzr = i7 == 0 ? null : zzhhb.zzr(bArr, 0, i7);
                        if (zzhhbVarZzr == null) {
                            break;
                        }
                        arrayList.add(zzhhbVarZzr);
                        iMin = Math.min(iMin + iMin, 8192);
                    }
                    bArrZzv = zzhhb.zzt(arrayList).zzv();
                    AbstractC3756k.m18186a(fileInputStream);
                } catch (IOException unused) {
                    AbstractC3756k.m18186a(fileInputStream);
                    bArrZzv = null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    AbstractC3756k.m18186a(fileInputStream2);
                    throw th;
                }
            } catch (IOException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            this.zze = bArrZzv;
        }
        byte[] bArr2 = this.zze;
        if (bArr2 == null) {
            return null;
        }
        return Arrays.copyOf(bArr2, bArr2.length);
    }

    public final boolean zze(long j7) {
        return this.zza.zzc() - (System.currentTimeMillis() / 1000) < 3600;
    }
}
