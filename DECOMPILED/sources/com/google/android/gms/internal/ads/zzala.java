package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzala implements zzajv {
    private final zzef zza = new zzef();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzala(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzeo.zzj(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.zzg = i7;
        boolean z7 = (bArr[0] & 32) != 0;
        this.zzb = z7;
        if (z7) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            int i12 = i11 | 33;
            int i13 = i7 & 1;
            int i14 = i7 & 2;
            boolean z7 = true;
            if (i13 != 0) {
                if (i14 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i9, i10, i12);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i9, i10, i12);
                    z7 = false;
                }
            } else if (i14 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i9, i10, i12);
            } else {
                z7 = false;
            }
            if ((i7 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i9, i10, i12);
            } else {
                if (i13 != 0 || z7) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i9, i10, i12);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i9, i10, i11 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i7, int i8, zzaju zzajuVar, zzdf zzdfVar) {
        String strZzK;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        zzef zzefVar = this.zza;
        zzefVar.zzb(bArr, i7 + i8);
        zzefVar.zzh(i7);
        int i15 = 1;
        int i16 = 0;
        int i17 = 2;
        zzghc.zza(zzefVar.zzd() >= 2);
        int iZzt = zzefVar.zzt();
        if (iZzt == 0) {
            strZzK = "";
        } else {
            int iZzg = zzefVar.zzg();
            Charset charsetZzR = zzefVar.zzR();
            int iZzg2 = zzefVar.zzg() - iZzg;
            if (charsetZzR == null) {
                charsetZzR = StandardCharsets.UTF_8;
            }
            strZzK = zzefVar.zzK(iZzt - iZzg2, charsetZzR);
        }
        if (strZzK.isEmpty()) {
            zzdfVar.zza(new zzajn(zzgjz.zzi(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzK);
        int i18 = this.zzc;
        zzb(spannableStringBuilder, i18, 0, 0, spannableStringBuilder.length(), 16711680);
        int i19 = i18;
        int i20 = this.zzd;
        zzc(spannableStringBuilder, i20, -1, 0, spannableStringBuilder.length(), 16711680);
        int i21 = i20;
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.zzf;
        while (zzefVar.zzd() >= 8) {
            int iZzg3 = zzefVar.zzg();
            int iZzB = zzefVar.zzB();
            int iZzB2 = zzefVar.zzB();
            if (iZzB2 == 1937013100) {
                zzghc.zza(zzefVar.zzd() >= i17 ? i15 : i16);
                int iZzt2 = zzefVar.zzt();
                int i22 = i16;
                while (i22 < iZzt2) {
                    zzghc.zza(zzefVar.zzd() >= 12 ? i15 : i16);
                    int iZzt3 = zzefVar.zzt();
                    int iZzt4 = zzefVar.zzt();
                    zzefVar.zzk(i17);
                    int i23 = iZzt2;
                    int iZzs = zzefVar.zzs();
                    zzefVar.zzk(i15);
                    int iZzB3 = zzefVar.zzB();
                    int i24 = i15;
                    int i25 = i17;
                    if (iZzt4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzt4).length() + 44 + String.valueOf(length2).length() + 2);
                        sb.append("Truncating styl end (");
                        sb.append(iZzt4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        zzds.zzc("Tx3gParser", sb.toString());
                        iZzt4 = spannableStringBuilder.length();
                    }
                    if (iZzt3 >= iZzt4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzt3).length() + 36 + String.valueOf(iZzt4).length() + 2);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(iZzt3);
                        sb2.append(") >= end (");
                        sb2.append(iZzt4);
                        sb2.append(").");
                        zzds.zzc("Tx3gParser", sb2.toString());
                        i13 = i19;
                        i14 = i21;
                    } else {
                        int i26 = i19;
                        zzb(spannableStringBuilder, iZzs, i26, iZzt3, iZzt4, 0);
                        i13 = i26;
                        i14 = i21;
                        zzc(spannableStringBuilder, iZzB3, i14, iZzt3, iZzt4, 0);
                    }
                    i17 = i25;
                    iZzt2 = i23;
                    i19 = i13;
                    i21 = i14;
                    i15 = i24;
                    i22++;
                    i16 = 0;
                }
                i9 = i15;
                i10 = i21;
                i11 = i19;
                i12 = i17;
            } else {
                i9 = i15;
                int i27 = i17;
                i10 = i21;
                i11 = i19;
                if (iZzB2 == 1952608120 && this.zzb) {
                    i12 = i27;
                    zzghc.zza(zzefVar.zzd() >= i12 ? i9 : 0);
                    float fZzt = zzefVar.zzt();
                    int i28 = this.zzg;
                    String str2 = zzeo.zza;
                    fMax = Math.max(0.0f, Math.min(fZzt / i28, 0.95f));
                } else {
                    i12 = i27;
                }
            }
            zzefVar.zzh(iZzg3 + iZzB);
            i19 = i11;
            i17 = i12;
            i21 = i10;
            i16 = 0;
            i15 = i9;
        }
        zzck zzckVar = new zzck();
        zzckVar.zza(spannableStringBuilder);
        zzckVar.zzf(fMax, 0);
        zzckVar.zzg(0);
        zzdfVar.zza(new zzajn(zzgjz.zzj(zzckVar.zzr()), -9223372036854775807L, -9223372036854775807L));
    }
}
