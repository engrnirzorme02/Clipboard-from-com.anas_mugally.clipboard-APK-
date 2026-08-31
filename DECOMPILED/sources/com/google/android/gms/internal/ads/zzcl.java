package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcl {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    private static final String zzG;
    private static final String zzH;
    private static final String zzI;
    private static final String zzq;
    private static final String zzr;
    private static final String zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;
    public final CharSequence zza;
    public final Layout.Alignment zzb;
    public final Layout.Alignment zzc;
    public final Bitmap zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final int zzi;
    public final float zzj;
    public final float zzk;
    public final int zzl;
    public final float zzm;
    public final int zzn;
    public final float zzo;
    public final int zzp;

    static {
        zzck zzckVar = new zzck();
        zzckVar.zza("");
        zzckVar.zzr();
        String str = zzeo.zza;
        zzq = Integer.toString(0, 36);
        zzr = Integer.toString(17, 36);
        zzs = Integer.toString(1, 36);
        zzt = Integer.toString(2, 36);
        Integer.toString(3, 36);
        zzu = Integer.toString(18, 36);
        zzv = Integer.toString(4, 36);
        zzw = Integer.toString(5, 36);
        zzx = Integer.toString(6, 36);
        zzy = Integer.toString(7, 36);
        zzz = Integer.toString(8, 36);
        zzA = Integer.toString(9, 36);
        zzB = Integer.toString(10, 36);
        zzC = Integer.toString(11, 36);
        zzD = Integer.toString(12, 36);
        zzE = Integer.toString(13, 36);
        zzF = Integer.toString(14, 36);
        zzG = Integer.toString(15, 36);
        zzH = Integer.toString(16, 36);
        zzI = Integer.toString(19, 36);
    }

    /* synthetic */ zzcl(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f7, int i7, int i8, float f8, int i9, int i10, float f9, float f10, float f11, boolean z7, int i11, int i12, float f12, int i13, byte[] bArr) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            zzghc.zza(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.zza = SpannedString.valueOf(charSequence);
        } else {
            this.zza = charSequence != null ? charSequence.toString() : null;
        }
        this.zzb = alignment;
        this.zzc = alignment2;
        this.zzd = bitmap;
        this.zze = f7;
        this.zzf = i7;
        this.zzg = i8;
        this.zzh = f8;
        this.zzi = i9;
        this.zzj = f10;
        this.zzk = f11;
        this.zzl = i10;
        this.zzm = f9;
        this.zzn = i12;
        this.zzo = f12;
        this.zzp = i13;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcl.class == obj.getClass()) {
            zzcl zzclVar = (zzcl) obj;
            if (TextUtils.equals(this.zza, zzclVar.zza) && this.zzb == zzclVar.zzb && this.zzc == zzclVar.zzc && ((bitmap = this.zzd) != null ? !((bitmap2 = zzclVar.zzd) == null || !bitmap.sameAs(bitmap2)) : zzclVar.zzd == null) && this.zze == zzclVar.zze && this.zzf == zzclVar.zzf && this.zzg == zzclVar.zzg && this.zzh == zzclVar.zzh && this.zzi == zzclVar.zzi && this.zzj == zzclVar.zzj && this.zzk == zzclVar.zzk && this.zzl == zzclVar.zzl && this.zzm == zzclVar.zzm && this.zzn == zzclVar.zzn && this.zzo == zzclVar.zzo && this.zzp == zzclVar.zzp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb, this.zzc, this.zzd, Float.valueOf(this.zze), Integer.valueOf(this.zzf), Integer.valueOf(this.zzg), Float.valueOf(this.zzh), Integer.valueOf(this.zzi), Float.valueOf(this.zzj), Float.valueOf(this.zzk), Boolean.FALSE, -16777216, Integer.valueOf(this.zzl), Float.valueOf(this.zzm), Integer.valueOf(this.zzn), Float.valueOf(this.zzo), Integer.valueOf(this.zzp));
    }

    public final zzck zza() {
        return new zzck(this, null);
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.zza;
        if (charSequence != null) {
            bundle.putCharSequence(zzq, charSequence);
            if (charSequence instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListZza = zzco.zza((Spanned) charSequence);
                if (!arrayListZza.isEmpty()) {
                    bundle.putParcelableArrayList(zzr, arrayListZza);
                }
            }
        }
        bundle.putSerializable(zzs, this.zzb);
        bundle.putSerializable(zzt, this.zzc);
        bundle.putFloat(zzv, this.zze);
        bundle.putInt(zzw, this.zzf);
        bundle.putInt(zzx, this.zzg);
        bundle.putFloat(zzy, this.zzh);
        bundle.putInt(zzz, this.zzi);
        bundle.putInt(zzA, this.zzl);
        bundle.putFloat(zzB, this.zzm);
        bundle.putFloat(zzC, this.zzj);
        bundle.putFloat(zzD, this.zzk);
        bundle.putBoolean(zzF, false);
        bundle.putInt(zzE, -16777216);
        bundle.putInt(zzG, this.zzn);
        bundle.putFloat(zzH, this.zzo);
        bundle.putInt(zzI, this.zzp);
        Bitmap bitmap = this.zzd;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zzghc.zzh(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(zzu, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }
}
