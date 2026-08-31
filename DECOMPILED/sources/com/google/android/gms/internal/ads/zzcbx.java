package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.common.util.AbstractC3756k;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcbx implements zzga {
    private final Context zza;
    private final zzga zzb;
    private final String zzc;
    private final int zzd;
    private final boolean zze;
    private InputStream zzf;
    private boolean zzg;
    private Uri zzh;
    private volatile zzbat zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private zzge zzl;

    public zzcbx(Context context, zzga zzgaVar, String str, int i7, zzgy zzgyVar, zzcbw zzcbwVar) {
        this.zza = context;
        this.zzb = zzgaVar;
        this.zzc = str;
        this.zzd = i7;
        new AtomicLong(-1L);
        this.zze = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcd)).booleanValue();
    }

    private final boolean zzf() {
        if (!this.zze) {
            return false;
        }
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzeQ)).booleanValue() || this.zzj) {
            return ((Boolean) C3250D.m17200c().zzd(zzbci.zzeR)).booleanValue() && !this.zzk;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i7, int i8) throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.zzf;
        return inputStream != null ? inputStream.read(bArr, i7, i8) : this.zzb.zza(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws IOException {
        Long l7;
        if (this.zzg) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.zzg = true;
        Uri uri = zzgeVar.zza;
        this.zzh = uri;
        this.zzl = zzgeVar;
        this.zzi = zzbat.zza(uri);
        zzbaq zzbaqVarZzc = null;
        if (!((Boolean) C3250D.m17200c().zzd(zzbci.zzeN)).booleanValue()) {
            if (this.zzi != null) {
                this.zzi.zzh = zzgeVar.zze;
                this.zzi.zzi = zzghs.zza(this.zzc);
                this.zzi.zzj = this.zzd;
                zzbaqVarZzc = C7351t.m32356n().zzc(this.zzi);
            }
            if (zzbaqVarZzc != null && zzbaqVarZzc.zza()) {
                this.zzj = zzbaqVarZzc.zzg();
                this.zzk = zzbaqVarZzc.zze();
                if (!zzf()) {
                    this.zzf = zzbaqVarZzc.zzb();
                    return -1L;
                }
            }
        } else if (this.zzi != null) {
            this.zzi.zzh = zzgeVar.zze;
            this.zzi.zzi = zzghs.zza(this.zzc);
            this.zzi.zzj = this.zzd;
            if (this.zzi.zzg) {
                l7 = (Long) C3250D.m17200c().zzd(zzbci.zzeP);
            } else {
                l7 = (Long) C3250D.m17200c().zzd(zzbci.zzeO);
            }
            long jLongValue = l7.longValue();
            C7351t.m32357o().mo18161c();
            C7351t.m32342D();
            Future futureZza = zzbbe.zza(this.zza, this.zzi);
            try {
                try {
                    zzbbf zzbbfVar = (zzbbf) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    zzbbfVar.zzc();
                    this.zzj = zzbbfVar.zzd();
                    this.zzk = zzbbfVar.zzf();
                    zzbbfVar.zze();
                    if (!zzf()) {
                        this.zzf = zzbbfVar.zzb();
                    }
                } catch (InterruptedException unused) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureZza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            C7351t.m32357o().mo18161c();
            throw null;
        }
        if (this.zzi != null) {
            zzgd zzgdVarZzb = zzgeVar.zzb();
            zzgdVarZzb.zza(Uri.parse(this.zzi.zza));
            this.zzl = zzgdVarZzb.zze();
        }
        return this.zzb.zzb(this.zzl);
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final Uri zzc() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws IOException {
        if (!this.zzg) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.zzg = false;
        this.zzh = null;
        InputStream inputStream = this.zzf;
        if (inputStream == null) {
            this.zzb.zzd();
        } else {
            AbstractC3756k.m18186a(inputStream);
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zze(zzgy zzgyVar) {
    }
}
