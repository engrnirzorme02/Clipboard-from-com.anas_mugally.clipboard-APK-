package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.ArrayList;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayy {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzazn zze;
    private final zzazu zzf;
    private int zzn;
    private final Object zzg = new Object();
    private final ArrayList zzh = new ArrayList();
    private final ArrayList zzi = new ArrayList();
    private final ArrayList zzj = new ArrayList();
    private int zzk = 0;
    private int zzl = 0;
    private int zzm = 0;
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";

    public zzayy(int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z7) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = z7;
        this.zze = new zzazn(i10);
        this.zzf = new zzazu(i11, i12, i13);
    }

    private final void zzm(String str, boolean z7, float f7, float f8, float f9, float f10) {
        if (str != null) {
            if (str.length() < this.zzc) {
                return;
            }
            synchronized (this.zzg) {
                try {
                    this.zzh.add(str);
                    this.zzk += str.length();
                    if (z7) {
                        ArrayList arrayList = this.zzi;
                        arrayList.add(str);
                        this.zzj.add(new zzazj(f7, f8, f9, f10, arrayList.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList, int i7) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            sb.append((String) arrayList.get(i8));
            sb.append(' ');
            i8++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String string = sb.toString();
        return string.length() < 100 ? string : string.substring(0, 100);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzayy)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzayy) obj).zzo;
        return str != null && str.equals(this.zzo);
    }

    public final int hashCode() {
        return this.zzo.hashCode();
    }

    public final String toString() {
        ArrayList arrayList = this.zzh;
        int i7 = this.zzl;
        int i8 = this.zzn;
        int i9 = this.zzk;
        String strZzn = zzn(arrayList, 100);
        String strZzn2 = zzn(this.zzi, 100);
        String str = this.zzo;
        String str2 = this.zzp;
        String str3 = this.zzq;
        int length = String.valueOf(i7).length();
        int length2 = String.valueOf(i8).length();
        int length3 = String.valueOf(i9).length();
        int length4 = String.valueOf(strZzn).length();
        int length5 = String.valueOf(strZzn2).length();
        int length6 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 32 + length2 + 14 + length3 + 8 + length4 + 14 + length5 + 12 + length6 + 20 + String.valueOf(str2).length() + 32 + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i7);
        sb.append(" score:");
        sb.append(i8);
        sb.append(" total_length:");
        sb.append(i9);
        sb.append("\n text: ");
        sb.append(strZzn);
        sb.append("\n viewableText");
        sb.append(strZzn2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }

    public final boolean zza() {
        boolean z7;
        synchronized (this.zzg) {
            z7 = this.zzm == 0;
        }
        return z7;
    }

    public final String zzb() {
        return this.zzo;
    }

    public final String zzc() {
        return this.zzq;
    }

    public final void zzd() {
        synchronized (this.zzg) {
            this.zzm--;
        }
    }

    public final void zze() {
        synchronized (this.zzg) {
            this.zzm++;
        }
    }

    public final void zzf(String str, boolean z7, float f7, float f8, float f9, float f10) {
        zzm(str, z7, f7, f8, f9, f10);
        synchronized (this.zzg) {
            try {
                if (this.zzm < 0) {
                    int i7 = AbstractC3490o0.f14278b;
                    AbstractC7599p.m33326a("ActivityContent: negative number of WebViews.");
                }
                zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzg(String str, boolean z7, float f7, float f8, float f9, float f10) {
        zzm(str, z7, f7, f8, f9, f10);
    }

    public final void zzh() {
        synchronized (this.zzg) {
            try {
                int iZzj = zzj(this.zzk, this.zzl);
                if (iZzj > this.zzn) {
                    this.zzn = iZzj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzi() {
        synchronized (this.zzg) {
            try {
                int iZzj = zzj(this.zzk, this.zzl);
                if (iZzj > this.zzn) {
                    this.zzn = iZzj;
                    if (!C7351t.m32354l().zzo().zzc()) {
                        zzazn zzaznVar = this.zze;
                        this.zzo = zzaznVar.zza(this.zzh);
                        this.zzp = zzaznVar.zza(this.zzi);
                    }
                    if (!C7351t.m32354l().zzo().zze()) {
                        this.zzq = this.zzf.zza(this.zzi, this.zzj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final int zzj(int i7, int i8) {
        return this.zzd ? this.zzb : (i7 * this.zza) + (i8 * this.zzb);
    }

    public final void zzk(int i7) {
        this.zzl = i7;
    }

    final int zzl() {
        return this.zzk;
    }
}
