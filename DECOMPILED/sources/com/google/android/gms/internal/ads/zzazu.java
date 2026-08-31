package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazu {
    private final zzazk zza;
    private final int zzb;
    private final int zzc;

    public zzazu(int i7, int i8, int i9) {
        this.zzb = i7;
        i8 = (i8 > 64 || i8 < 0) ? 64 : i8;
        if (i9 <= 0) {
            this.zzc = 1;
        } else {
            this.zzc = i9;
        }
        this.zza = new zzazs(i8);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    public final String zza(ArrayList arrayList, ArrayList arrayList2) {
        Collections.sort(arrayList2, new zzazt(this));
        HashSet hashSet = new HashSet();
        loop0: for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            String[] strArrSplit = Normalizer.normalize((CharSequence) arrayList.get(((zzazj) arrayList2.get(i7)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (strArrSplit.length != 0) {
                for (String str : strArrSplit) {
                    if (str.contains("'")) {
                        StringBuilder sb = new StringBuilder(str);
                        int i8 = 1;
                        boolean z7 = false;
                        while (true) {
                            int i9 = i8 + 2;
                            if (i9 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i8) == '\'') {
                                if (sb.charAt(i8 - 1) != ' ') {
                                    int i10 = i8 + 1;
                                    if ((sb.charAt(i10) == 's' || sb.charAt(i10) == 'S') && (i9 == sb.length() || sb.charAt(i9) == ' ')) {
                                        sb.insert(i8, ' ');
                                        i8 = i9;
                                    } else {
                                        sb.setCharAt(i8, ' ');
                                    }
                                } else {
                                    sb.setCharAt(i8, ' ');
                                }
                                z7 = true;
                            }
                            i8++;
                        }
                        String string = z7 ? sb.toString() : null;
                        if (string != null) {
                            str = string;
                        }
                    }
                    String[] strArrZzb = zzazo.zzb(str, true);
                    int length = strArrZzb.length;
                    int i11 = this.zzc;
                    if (length >= i11) {
                        for (int i12 = 0; i12 < strArrZzb.length; i12++) {
                            String strConcat = "";
                            for (int i13 = 0; i13 < i11; i13++) {
                                int i14 = i12 + i13;
                                if (i14 >= strArrZzb.length) {
                                    break;
                                }
                                if (i13 > 0) {
                                    strConcat = strConcat.concat(" ");
                                }
                                strConcat = strConcat.concat(String.valueOf(strArrZzb[i14]));
                            }
                            hashSet.add(strConcat);
                            if (hashSet.size() >= this.zzb) {
                                break loop0;
                            }
                        }
                        if (hashSet.size() >= this.zzb) {
                            break loop0;
                        }
                    }
                }
            }
        }
        zzazm zzazmVar = new zzazm();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                zzazmVar.zzb.write(this.zza.zza((String) it.next()));
            } catch (IOException e7) {
                int i15 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Error while writing hash to byteStream", e7);
            }
        }
        return zzazmVar.toString();
    }
}
