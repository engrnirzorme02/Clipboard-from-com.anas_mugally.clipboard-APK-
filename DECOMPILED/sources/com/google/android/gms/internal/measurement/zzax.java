package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzax extends zzav {
    public zzax() {
        this.zza.add(zzbk.EQUALS);
        this.zza.add(zzbk.GREATER_THAN);
        this.zza.add(zzbk.GREATER_THAN_EQUALS);
        this.zza.add(zzbk.IDENTITY_EQUALS);
        this.zza.add(zzbk.IDENTITY_NOT_EQUALS);
        this.zza.add(zzbk.LESS_THAN);
        this.zza.add(zzbk.LESS_THAN_EQUALS);
        this.zza.add(zzbk.NOT_EQUALS);
    }

    private static boolean zzc(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof zzak) {
            zzaoVar = new zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof zzak) {
            zzaoVar2 = new zzas(zzaoVar2.zzc());
        }
        if ((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) {
            return zzaoVar.zzc().compareTo(zzaoVar2.zzc()) < 0;
        }
        double dDoubleValue = zzaoVar.zzd().doubleValue();
        double dDoubleValue2 = zzaoVar2.zzd().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean zzd(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar.getClass().equals(zzaoVar2.getClass())) {
            if ((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) {
                return true;
            }
            if (zzaoVar instanceof zzah) {
                return (Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue()) || zzaoVar.zzd().doubleValue() != zzaoVar2.zzd().doubleValue()) ? false : true;
            }
            if (zzaoVar instanceof zzas) {
                return zzaoVar.zzc().equals(zzaoVar2.zzc());
            }
            if (zzaoVar instanceof zzaf) {
                return zzaoVar.zze().equals(zzaoVar2.zze());
            }
            return zzaoVar == zzaoVar2;
        }
        if (((zzaoVar instanceof zzat) || (zzaoVar instanceof zzam)) && ((zzaoVar2 instanceof zzat) || (zzaoVar2 instanceof zzam))) {
            return true;
        }
        boolean z7 = zzaoVar instanceof zzah;
        if (z7 && (zzaoVar2 instanceof zzas)) {
            return zzd(zzaoVar, new zzah(zzaoVar2.zzd()));
        }
        boolean z8 = zzaoVar instanceof zzas;
        if ((!z8 || !(zzaoVar2 instanceof zzah)) && !(zzaoVar instanceof zzaf)) {
            if (zzaoVar2 instanceof zzaf) {
                return zzd(zzaoVar, new zzah(zzaoVar2.zzd()));
            }
            if ((z8 || z7) && (zzaoVar2 instanceof zzak)) {
                return zzd(zzaoVar, new zzas(zzaoVar2.zzc()));
            }
            if ((zzaoVar instanceof zzak) && ((zzaoVar2 instanceof zzas) || (zzaoVar2 instanceof zzah))) {
                return zzd(new zzas(zzaoVar.zzc()), zzaoVar2);
            }
            return false;
        }
        return zzd(new zzah(zzaoVar.zzd()), zzaoVar2);
    }

    private static boolean zze(zzao zzaoVar, zzao zzaoVar2) {
        if (zzaoVar instanceof zzak) {
            zzaoVar = new zzas(zzaoVar.zzc());
        }
        if (zzaoVar2 instanceof zzak) {
            zzaoVar2 = new zzas(zzaoVar2.zzc());
        }
        return (((zzaoVar instanceof zzas) && (zzaoVar2 instanceof zzas)) || !(Double.isNaN(zzaoVar.zzd().doubleValue()) || Double.isNaN(zzaoVar2.zzd().doubleValue()))) && !zzc(zzaoVar2, zzaoVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzav
    public final zzao zza(String str, zzg zzgVar, List list) {
        boolean zZzd;
        boolean zZzd2;
        zzh.zza(zzh.zze(str).name(), 2, list);
        zzao zzaoVarZza = zzgVar.zza((zzao) list.get(0));
        zzao zzaoVarZza2 = zzgVar.zza((zzao) list.get(1));
        int iOrdinal = zzh.zze(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zZzd2 = zzd(zzaoVarZza, zzaoVarZza2);
            } else if (iOrdinal == 42) {
                zZzd = zzc(zzaoVarZza, zzaoVarZza2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zZzd = zzc(zzaoVarZza2, zzaoVarZza);
                        break;
                    case 38:
                        zZzd = zze(zzaoVarZza2, zzaoVarZza);
                        break;
                    case 39:
                        zZzd = zzh.zzf(zzaoVarZza, zzaoVarZza2);
                        break;
                    case 40:
                        zZzd2 = zzh.zzf(zzaoVarZza, zzaoVarZza2);
                        break;
                    default:
                        return super.zzb(str);
                }
            } else {
                zZzd = zze(zzaoVarZza, zzaoVarZza2);
            }
            zZzd = !zZzd2;
        } else {
            zZzd = zzd(zzaoVarZza, zzaoVarZza2);
        }
        return zZzd ? zzao.zzk : zzao.zzl;
    }
}
