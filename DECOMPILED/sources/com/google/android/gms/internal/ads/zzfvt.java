package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;
import p157U3.InterfaceFutureC1673e;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfvt extends zzfvl {
    private final ExecutorService zzb;
    private final zzfvs zzc;
    private final Function zzd;

    public zzfvt(File file, ExecutorService executorService, zzfvs zzfvsVar, Function function) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzfvsVar;
        this.zzd = function;
    }

    @Override // com.google.android.gms.internal.ads.zzfvl
    public final InterfaceFutureC1673e zzb() {
        return zzgot.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzfvq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzd();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfvl
    public final InterfaceFutureC1673e zzc(final Object obj) {
        return zzgot.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzfvp
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zze(obj);
                return null;
            }
        }, this.zzb);
    }

    final /* synthetic */ Object zzd() {
        Object objZzc;
        Object objZzb;
        synchronized (this) {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.zza);
                        try {
                            objZzb = this.zzc.zzb(fileInputStream);
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e7) {
                        objZzc = this.zzd.apply(new zzfvo(e7));
                        return objZzc;
                    }
                } catch (zzfvo e8) {
                    objZzc = this.zzd.apply(e8);
                    return objZzc;
                }
            } catch (FileNotFoundException unused) {
                objZzc = this.zzc.zzc();
                return objZzc;
            }
        }
        return objZzb;
    }

    final /* synthetic */ Void zze(Object obj) {
        synchronized (this) {
            try {
                File file = this.zza;
                zzgmr.zzb(file);
                if (!file.exists() && !file.createNewFile()) {
                    String absolutePath = this.zza.getAbsolutePath();
                    StringBuilder sb = new StringBuilder(String.valueOf(absolutePath).length() + 23);
                    sb.append("Failed to create file: ");
                    sb.append(absolutePath);
                    throw new IOException(sb.toString());
                }
                file.setWritable(true);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    this.zzc.zza(obj, fileOutputStream);
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return null;
    }
}
