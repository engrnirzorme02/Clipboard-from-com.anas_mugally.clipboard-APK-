package com.google.android.gms.internal.ads;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class zzakp implements zzajv {
    private static final Pattern zza = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern zzb = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder zzc = new StringBuilder();
    private final ArrayList zzd = new ArrayList();
    private final zzef zze = new zzef();

    public static float zzb(int i7) {
        if (i7 == 0) {
            return 0.08f;
        }
        if (i7 == 1) {
            return 0.5f;
        }
        if (i7 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long zzc(Matcher matcher, int i7) {
        String strGroup = matcher.group(i7 + 1);
        long j7 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i7 + 2);
        strGroup2.getClass();
        long j8 = j7 + (Long.parseLong(strGroup2) * 60000);
        String strGroup3 = matcher.group(i7 + 3);
        strGroup3.getClass();
        long j9 = j8 + (Long.parseLong(strGroup3) * 1000);
        String strGroup4 = matcher.group(i7 + 4);
        if (strGroup4 != null) {
            j9 += Long.parseLong(strGroup4);
        }
        return j9 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:94:0x018e  */
    @Override // com.google.android.gms.internal.ads.zzajv
    public final void zza(byte[] bArr, int i7, int i8, zzaju zzajuVar, zzdf zzdfVar) {
        zzef zzefVar;
        String str;
        byte b7;
        byte b8;
        int i9;
        zzcl zzclVarZzr;
        zzakp zzakpVar = this;
        zzef zzefVar2 = zzakpVar.zze;
        zzefVar2.zzb(bArr, i7 + i8);
        zzefVar2.zzh(i7);
        Charset charsetZzR = zzefVar2.zzR();
        if (charsetZzR == null) {
            charsetZzR = StandardCharsets.UTF_8;
        }
        while (true) {
            String strZzN = zzefVar2.zzN(charsetZzR);
            if (strZzN == null) {
                return;
            }
            if (strZzN.isEmpty()) {
                zzefVar = zzefVar2;
            } else {
                try {
                    Integer.parseInt(strZzN);
                    zzef zzefVar3 = zzakpVar.zze;
                    String strZzN2 = zzefVar3.zzN(charsetZzR);
                    if (strZzN2 == null) {
                        zzds.zzc("SubripParser", "Unexpected end");
                        return;
                    }
                    Matcher matcher = zza.matcher(strZzN2);
                    if (matcher.matches()) {
                        long jZzc = zzc(matcher, 1);
                        long jZzc2 = zzc(matcher, 6);
                        StringBuilder sb = zzakpVar.zzc;
                        int i10 = 0;
                        sb.setLength(0);
                        ArrayList arrayList = zzakpVar.zzd;
                        arrayList.clear();
                        String strZzN3 = zzefVar3.zzN(charsetZzR);
                        while (!TextUtils.isEmpty(strZzN3)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String strTrim = strZzN3.trim();
                            StringBuilder sb2 = new StringBuilder(strTrim);
                            Matcher matcher2 = zzb.matcher(strTrim);
                            int i11 = i10;
                            while (matcher2.find()) {
                                String strGroup = matcher2.group();
                                arrayList.add(strGroup);
                                int iStart = matcher2.start() - i11;
                                int length = strGroup.length();
                                sb2.replace(iStart, iStart + length, "");
                                i11 += length;
                                zzefVar2 = zzefVar2;
                            }
                            sb.append(sb2.toString());
                            strZzN3 = zzefVar3.zzN(charsetZzR);
                            i10 = 0;
                        }
                        zzefVar = zzefVar2;
                        Spanned spannedFromHtml = Html.fromHtml(sb.toString());
                        int i12 = 0;
                        while (true) {
                            if (i12 < arrayList.size()) {
                                str = (String) arrayList.get(i12);
                                if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                    i12++;
                                }
                            } else {
                                str = null;
                            }
                        }
                        zzck zzckVar = new zzck();
                        zzckVar.zza(spannedFromHtml);
                        if (str == null) {
                            zzclVarZzr = zzckVar.zzr();
                        } else {
                            switch (str) {
                                case "{\an1}":
                                    b7 = 0;
                                    break;
                                case "{\an3}":
                                    b7 = 3;
                                    break;
                                case "{\an4}":
                                    b7 = 1;
                                    break;
                                case "{\an6}":
                                    b7 = 4;
                                    break;
                                case "{\an7}":
                                    b7 = 2;
                                    break;
                                case "{\an9}":
                                    b7 = 5;
                                    break;
                                default:
                                    b7 = -1;
                                    break;
                            }
                            if (b7 == 0 || b7 == 1 || b7 == 2) {
                                zzckVar.zzj(0);
                            } else if (b7 == 3 || b7 == 4 || b7 == 5) {
                                zzckVar.zzj(2);
                            } else {
                                zzckVar.zzj(1);
                            }
                            switch (str) {
                                case "{\an1}":
                                    b8 = 0;
                                    break;
                                case "{\an2}":
                                    b8 = 1;
                                    break;
                                case "{\an3}":
                                    b8 = 2;
                                    break;
                                case "{\an7}":
                                    b8 = 3;
                                    break;
                                case "{\an8}":
                                    b8 = 4;
                                    break;
                                case "{\an9}":
                                    b8 = 5;
                                    break;
                                default:
                                    b8 = -1;
                                    break;
                            }
                            if (b8 == 0 || b8 == 1) {
                                i9 = 2;
                            } else {
                                if (b8 == 2) {
                                    i9 = 2;
                                } else if (b8 == 3 || b8 == 4 || b8 == 5) {
                                    zzckVar.zzg(0);
                                } else {
                                    zzckVar.zzg(1);
                                }
                                zzckVar.zzi(zzb(zzckVar.zzk()));
                                zzckVar.zzf(zzb(zzckVar.zzh()), 0);
                                zzclVarZzr = zzckVar.zzr();
                            }
                            zzckVar.zzg(i9);
                            zzckVar.zzi(zzb(zzckVar.zzk()));
                            zzckVar.zzf(zzb(zzckVar.zzh()), 0);
                            zzclVarZzr = zzckVar.zzr();
                        }
                        zzdfVar.zza(new zzajn(zzgjz.zzj(zzclVarZzr), jZzc, jZzc2 - jZzc));
                    } else {
                        zzefVar = zzefVar2;
                        zzds.zzc("SubripParser", "Skipping invalid timing: ".concat(strZzN2));
                    }
                } catch (NumberFormatException unused) {
                    zzefVar = zzefVar2;
                    zzds.zzc("SubripParser", "Skipping invalid index: ".concat(strZzN));
                }
            }
            zzakpVar = this;
            zzefVar2 = zzefVar;
        }
    }
}
