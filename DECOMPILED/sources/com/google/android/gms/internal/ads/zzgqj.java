package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqj {
    private final List zza = new ArrayList();
    private final zzgxy zzb = zzgxy.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgqh) it.next()).zzd(false);
        }
    }

    public final zzgqj zza(zzgqh zzgqhVar) {
        if (zzgqhVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzgqhVar.zzc()) {
            zzc();
        }
        zzgqhVar.zzi(this);
        this.zza.add(zzgqhVar);
        return this;
    }

    public final zzgqo zzb() throws GeneralSecurityException {
        int i7;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzgqh> list = this.zza;
        zzhdz zzhdzVarZzg = zzhec.zzg();
        ArrayList arrayList = new ArrayList(list.size());
        int i8 = 0;
        while (i8 < list.size() - 1) {
            int i9 = i8 + 1;
            if (((zzgqh) list.get(i8)).zzg() == zzgqi.zza && ((zzgqh) list.get(i9)).zzg() != zzgqi.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i8 = i9;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzgqh zzgqhVar : list) {
            zzgqhVar.zze();
            if (zzgqhVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (zzgqhVar.zzg() == zzgqi.zza) {
                int i10 = 0;
                while (true) {
                    if (i10 != 0 && !hashSet.contains(Integer.valueOf(i10))) {
                        break;
                    }
                    int i11 = zzgzu.zza;
                    i10 = 0;
                    while (i10 == 0) {
                        byte[] bArrZza = zzgzm.zza(4);
                        i10 = (bArrZza[3] & 255) | ((bArrZza[0] & 255) << 24) | ((bArrZza[1] & 255) << 16) | ((bArrZza[2] & 255) << 8);
                    }
                }
                i7 = i10;
            } else {
                zzgqhVar.zzg();
                i7 = 0;
            }
            Integer numValueOf = Integer.valueOf(i7);
            if (hashSet.contains(numValueOf)) {
                StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 31);
                sb.append("Id ");
                sb.append(i7);
                sb.append(" is used twice in the keyset");
                throw new GeneralSecurityException(sb.toString());
            }
            hashSet.add(numValueOf);
            zzgqd zzgqdVarZzc = zzgyf.zza().zzc(zzgqhVar.zzf(), true != zzgqhVar.zzf().zza() ? null : numValueOf);
            zzgqm zzgqmVar = new zzgqm(zzgqdVarZzc, zzgqo.zzj(zzgqhVar.zze()), i7, zzgqhVar.zzc(), false, zzgqm.zza, null);
            zzhdzVarZzg.zzb(zzgqo.zzq(zzgqdVarZzc, zzgqo.zzj(zzgqhVar.zze()), i7));
            if (zzgqhVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzgqhVar.zze() != zzgqf.zza) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzgqmVar);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzhdzVarZzg.zza(num.intValue());
        zzhec zzhecVar = (zzhec) zzhdzVarZzg.zzbu();
        zzgqo.zzn(zzhecVar);
        return zzgqo.zzh(new zzgqo(zzhecVar, arrayList, this.zzb, bArr));
    }
}
