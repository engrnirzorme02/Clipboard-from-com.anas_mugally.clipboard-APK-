package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class zzajy implements zzaeb {
    private final zzaeb zza;
    private final zzajt zzb;
    private zzajv zzg;
    private zzu zzh;
    private boolean zzi;
    private int zzd = 0;
    private int zze = 0;
    private byte[] zzf = zzeo.zzb;
    private final zzef zzc = new zzef();

    public zzajy(zzaeb zzaebVar, zzajt zzajtVar) {
        this.zza = zzaebVar;
        this.zzb = zzajtVar;
    }

    private final void zzc(int i7) {
        int length = this.zzf.length;
        int i8 = this.zze;
        if (length - i8 >= i7) {
            return;
        }
        int i9 = i8 - this.zzd;
        int iMax = Math.max(i9 + i9, i7 + i9);
        byte[] bArr = this.zzf;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.zzd, bArr2, 0, i9);
        this.zzd = 0;
        this.zze = i9;
        this.zzf = bArr2;
    }

    public final void zza(boolean z7) {
        this.zzi = true;
    }

    final /* synthetic */ void zzb(long j7, int i7, zzajn zzajnVar) {
        this.zzh.getClass();
        zzgjz zzgjzVar = zzajnVar.zza;
        long j8 = zzajnVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzgjzVar.size());
        Iterator<E> it = zzgjzVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzcl) it.next()).zzb());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j8);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        zzef zzefVar = this.zzc;
        int length = bArrMarshall.length;
        zzefVar.zzb(bArrMarshall, length);
        zzaeb zzaebVar = this.zza;
        zzaebVar.zzz(zzefVar, length);
        long j9 = zzajnVar.zzb;
        if (j9 == -9223372036854775807L) {
            zzghc.zzh(this.zzh.zzt == Long.MAX_VALUE);
        } else {
            long j10 = this.zzh.zzt;
            j7 = j10 == Long.MAX_VALUE ? j7 + j9 : j9 + j10;
        }
        zzaebVar.zzx(j7, i7 | 1, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzu(zzu zzuVar) {
        String str = zzuVar.zzo;
        str.getClass();
        zzghc.zza(zzar.zzg(str) == 3);
        if (!zzuVar.equals(this.zzh)) {
            this.zzh = zzuVar;
            zzajt zzajtVar = this.zzb;
            this.zzg = zzajtVar.zza(zzuVar) ? zzajtVar.zzc(zzuVar) : null;
        }
        if (this.zzg == null) {
            this.zza.zzu(zzuVar);
            return;
        }
        zzaeb zzaebVar = this.zza;
        zzs zzsVarZza = zzuVar.zza();
        zzsVarZza.zzm("application/x-media3-cues");
        zzsVarZza.zzj(str);
        zzsVarZza.zzr(Long.MAX_VALUE);
        zzsVarZza.zzK(this.zzb.zzb(zzuVar));
        zzaebVar.zzu(zzsVarZza.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zzv(zzi zziVar, int i7, boolean z7, int i8) throws EOFException {
        if (this.zzg == null) {
            return this.zza.zzv(zziVar, i7, z7, 0);
        }
        zzc(i7);
        int iZza = zziVar.zza(this.zzf, this.zze, i7);
        if (iZza != -1) {
            this.zze += iZza;
            return iZza;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzw(zzef zzefVar, int i7, int i8) {
        if (this.zzg == null) {
            this.zza.zzw(zzefVar, i7, i8);
            return;
        }
        zzc(i7);
        zzefVar.zzm(this.zzf, this.zze, i7);
        this.zze += i7;
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzx(final long j7, final int i7, int i8, int i9, zzaea zzaeaVar) {
        if (this.zzg == null) {
            this.zza.zzx(j7, i7, i8, i9, zzaeaVar);
            return;
        }
        zzghc.zzb(zzaeaVar == null, "DRM on subtitles is not supported");
        int i10 = (this.zze - i9) - i8;
        try {
            this.zzg.zza(this.zzf, i10, i8, zzaju.zza(), new zzdf() { // from class: com.google.android.gms.internal.ads.zzajx
                @Override // com.google.android.gms.internal.ads.zzdf
                public final /* synthetic */ void zza(Object obj) {
                    this.zza.zzb(j7, i7, (zzajn) obj);
                }
            });
        } catch (RuntimeException e7) {
            if (!this.zzi) {
                throw e7;
            }
            zzds.zzd("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e7);
        }
        int i11 = i10 + i8;
        this.zzd = i11;
        if (i11 == this.zze) {
            this.zzd = 0;
            this.zze = 0;
        }
    }
}
