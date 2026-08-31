package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzagm extends zzagh {
    public final String zza;
    public final zzgjz zzb;

    public zzagm(String str, String str2, List list) {
        super(str);
        zzghc.zza(!list.isEmpty());
        this.zza = str2;
        zzgjz zzgjzVarZzq = zzgjz.zzq(list);
        this.zzb = zzgjzVarZzq;
    }

    private static List zzb(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagm.class == obj.getClass()) {
            zzagm zzagmVar = (zzagm) obj;
            if (Objects.equals(this.zzf, zzagmVar.zzf) && Objects.equals(this.zza, zzagmVar.zza) && this.zzb.equals(zzagmVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + 527;
        String str = this.zza;
        return (((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.zzb.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String str = this.zzf;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + strValueOf.length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": values=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzan
    public final void zza(zzal zzalVar) {
        byte b7;
        switch (this.zzf) {
            case "TAL":
                b7 = 6;
                break;
            case "TCM":
                b7 = 16;
                break;
            case "TDA":
                b7 = 12;
                break;
            case "TP1":
                b7 = 2;
                break;
            case "TP2":
                b7 = 4;
                break;
            case "TP3":
                b7 = 18;
                break;
            case "TRK":
                b7 = 8;
                break;
            case "TT2":
                b7 = 0;
                break;
            case "TXT":
                b7 = 20;
                break;
            case "TYE":
                b7 = 10;
                break;
            case "TALB":
                b7 = 7;
                break;
            case "TCOM":
                b7 = 17;
                break;
            case "TCON":
                b7 = 22;
                break;
            case "TDAT":
                b7 = 13;
                break;
            case "TDRC":
                b7 = 14;
                break;
            case "TDRL":
                b7 = 15;
                break;
            case "TEXT":
                b7 = 21;
                break;
            case "TIT2":
                b7 = 1;
                break;
            case "TPE1":
                b7 = 3;
                break;
            case "TPE2":
                b7 = 5;
                break;
            case "TPE3":
                b7 = 19;
                break;
            case "TRCK":
                b7 = 9;
                break;
            case "TYER":
                b7 = 11;
                break;
            default:
                b7 = -1;
                break;
        }
        try {
            switch (b7) {
                case 0:
                case 1:
                    zzalVar.zza((CharSequence) this.zzb.get(0));
                    break;
                case 2:
                case 3:
                    zzalVar.zzb((CharSequence) this.zzb.get(0));
                    break;
                case 4:
                case 5:
                    zzalVar.zzd((CharSequence) this.zzb.get(0));
                    break;
                case 6:
                case 7:
                    zzalVar.zzc((CharSequence) this.zzb.get(0));
                    break;
                case 8:
                case 9:
                    String str = (String) this.zzb.get(0);
                    String str2 = zzeo.zza;
                    String[] strArrSplit = str.split("/", -1);
                    int i7 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    zzalVar.zzg(Integer.valueOf(i7));
                    zzalVar.zzh(numValueOf);
                    break;
                case 10:
                case 11:
                    zzalVar.zzi(Integer.valueOf(Integer.parseInt((String) this.zzb.get(0))));
                    break;
                case 12:
                case 13:
                    String str3 = (String) this.zzb.get(0);
                    int i8 = Integer.parseInt(str3.substring(2, 4));
                    int i9 = Integer.parseInt(str3.substring(0, 2));
                    zzalVar.zzj(Integer.valueOf(i8));
                    zzalVar.zzk(Integer.valueOf(i9));
                    break;
                case 14:
                    List listZzb = zzb((String) this.zzb.get(0));
                    int size = listZzb.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                zzalVar.zzk((Integer) listZzb.get(2));
                            }
                        }
                        zzalVar.zzj((Integer) listZzb.get(1));
                    }
                    zzalVar.zzi((Integer) listZzb.get(0));
                    break;
                case 15:
                    List listZzb2 = zzb((String) this.zzb.get(0));
                    int size2 = listZzb2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                zzalVar.zzn((Integer) listZzb2.get(2));
                            }
                        }
                        zzalVar.zzm((Integer) listZzb2.get(1));
                    }
                    zzalVar.zzl((Integer) listZzb2.get(0));
                    break;
                case 16:
                case 17:
                    zzalVar.zzp((CharSequence) this.zzb.get(0));
                    break;
                case 18:
                case 19:
                    zzalVar.zzq((CharSequence) this.zzb.get(0));
                    break;
                case 20:
                case zzbbn.zzt.zzm /* 21 */:
                    zzalVar.zzo((CharSequence) this.zzb.get(0));
                    break;
                case 22:
                    zzgjz zzgjzVar = this.zzb;
                    Integer numZzh = zzgne.zzh((String) zzgjzVar.get(0), 10);
                    if (numZzh != null) {
                        String strZza = zzagi.zza(numZzh.intValue());
                        if (strZza != null) {
                            zzalVar.zzt(strZza);
                        }
                    } else {
                        zzalVar.zzt((CharSequence) zzgjzVar.get(0));
                    }
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
