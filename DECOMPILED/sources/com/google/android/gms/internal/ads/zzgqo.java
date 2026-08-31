package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgqo implements zzgxr {
    private final List zza;
    private final zzgxy zzb;
    private final zzgqo zzc;

    /* synthetic */ zzgqo(zzhec zzhecVar, List list, zzgxy zzgxyVar, byte[] bArr) {
        this(zzhecVar, list, zzgxyVar);
    }

    static final zzgqo zza(zzhec zzhecVar) throws GeneralSecurityException {
        zzn(zzhecVar);
        return new zzgqo(zzhecVar, zzl(zzhecVar), zzgxy.zza);
    }

    public static final zzgqo zzf(zzgqs zzgqsVar) {
        zzgqj zzgqjVar = new zzgqj();
        zzgqh zzgqhVar = new zzgqh(zzgqsVar, null);
        zzgqhVar.zzb();
        zzgqhVar.zza();
        zzgqjVar.zza(zzgqhVar);
        return zzgqjVar.zzb();
    }

    static /* synthetic */ zzgqo zzh(final zzgqo zzgqoVar) {
        final zzgxy zzgxyVar = zzgqoVar.zzb;
        if (zzgxyVar.zza()) {
            return zzgqoVar;
        }
        zzgqk zzgqkVar = new zzgqk() { // from class: com.google.android.gms.internal.ads.zzgqn
            @Override // com.google.android.gms.internal.ads.zzgqk
            public final /* synthetic */ void zza(zzgqm zzgqmVar) {
                zzgyj.zza().zzb().zza(this.zza, zzgxyVar, "keyset_handle", "get_key");
            }
        };
        List<zzgqm> list = zzgqoVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzgqm zzgqmVar : list) {
            arrayList.add(new zzgqm(zzgqmVar.zzf(), zzgqmVar.zzj(), zzgqmVar.zzg(), zzgqmVar.zzh(), zzgqmVar.zzi(), zzgqkVar, null));
        }
        return new zzgqo(arrayList, zzgxyVar, zzgqoVar);
    }

    static /* synthetic */ int zzj(zzgqf zzgqfVar) {
        if (zzgqf.zza.equals(zzgqfVar)) {
            return 3;
        }
        if (zzgqf.zzb.equals(zzgqfVar)) {
            return 4;
        }
        if (zzgqf.zzc.equals(zzgqfVar)) {
            return 5;
        }
        throw new IllegalStateException("Unknown key status");
    }

    private static List zzl(zzhec zzhecVar) throws GeneralSecurityException {
        zzgqd zzgxvVar;
        boolean z7;
        ArrayList arrayList = new ArrayList(zzhecVar.zzc());
        for (zzheb zzhebVar : zzhecVar.zzb()) {
            int iZzc = zzhebVar.zzc();
            try {
                zzgzj zzgzjVarZzo = zzo(zzhebVar);
                zzgyo zzgyoVarZza = zzgyo.zza();
                zzgqt zzgqtVarZza = zzgqt.zza();
                zzgxvVar = !zzgyoVarZza.zzf(zzgzjVarZzo) ? new zzgxv(zzgzjVarZzo, zzgqtVarZza) : zzgyoVarZza.zzg(zzgzjVarZzo, zzgqtVarZza);
                z7 = false;
            } catch (GeneralSecurityException e7) {
                if (zzgxb.zza.zza()) {
                    throw e7;
                }
                zzgxvVar = new zzgxv(zzo(zzhebVar), zzgqt.zza());
                z7 = true;
            }
            if (zzgxb.zza.zza() && !zzp(zzhebVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z8 = true;
            int iZzk = zzhebVar.zzk();
            if (iZzc != zzhecVar.zza()) {
                z8 = false;
            }
            arrayList.add(new zzgqm(zzgxvVar, iZzk, iZzc, z8, z7, zzgqm.zza, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzgqo zzm() {
        zzgqo zzgqoVar = this.zzc;
        return zzgqoVar == null ? this : zzgqoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzhec zzhecVar) throws GeneralSecurityException {
        if (zzhecVar == null || zzhecVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static zzgzj zzo(zzheb zzhebVar) {
        return zzgzj.zza(zzhebVar.zzb().zza(), zzhebVar.zzb().zzb(), zzhebVar.zzb().zzc(), zzhebVar.zzd(), zzhebVar.zzd() == zzhep.RAW ? null : Integer.valueOf(zzhebVar.zzc()));
    }

    private static boolean zzp(int i7) {
        int i8 = i7 - 2;
        return i8 == 1 || i8 == 2 || i8 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzheb zzq(zzgqd zzgqdVar, int i7, int i8) throws GeneralSecurityException {
        zzgzj zzgzjVar = (zzgzj) zzgyo.zza().zzh(zzgqdVar, zzgzj.class, zzgqt.zza());
        Integer numZze = zzgzjVar.zze();
        if (numZze != null && numZze.intValue() != i8) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        zzhea zzheaVarZze = zzheb.zze();
        zzhdr zzhdrVarZzd = zzhdt.zzd();
        zzhdrVarZzd.zza(zzgzjVar.zzg());
        zzhdrVarZzd.zzb(zzgzjVar.zzb());
        zzhdrVarZzd.zzc(zzgzjVar.zzc());
        zzheaVarZze.zza(zzhdrVarZzd);
        zzheaVarZze.zzd(i7);
        zzheaVarZze.zzb(i8);
        zzheaVarZze.zzc(zzgzjVar.zzd());
        return (zzheb) zzheaVarZze.zzbu();
    }

    public final String toString() {
        zzhec zzhecVarZzb = zzb();
        int i7 = zzgqv.zza;
        zzhed zzhedVarZza = zzheg.zza();
        zzhedVarZza.zza(zzhecVarZzb.zza());
        for (zzheb zzhebVar : zzhecVarZzb.zzb()) {
            zzhee zzheeVarZza = zzhef.zza();
            zzheeVarZza.zza(zzhebVar.zzb().zza());
            zzheeVarZza.zzd(zzhebVar.zzk());
            zzheeVarZza.zzc(zzhebVar.zzd());
            zzheeVarZza.zzb(zzhebVar.zzc());
            zzhedVarZza.zzb((zzhef) zzheeVarZza.zzbu());
        }
        return ((zzheg) zzhedVarZza.zzbu()).toString();
    }

    final zzhec zzb() {
        try {
            zzhdz zzhdzVarZzg = zzhec.zzg();
            for (zzgqm zzgqmVar : this.zza) {
                zzhdzVarZzg.zzb(zzq(zzgqmVar.zza(), zzgqmVar.zzj(), zzgqmVar.zzc()));
                if (zzgqmVar.zzd()) {
                    zzhdzVarZzg.zza(zzgqmVar.zzc());
                }
            }
            return (zzhec) zzhdzVarZzg.zzbu();
        } catch (GeneralSecurityException e7) {
            throw new zzgzt(e7);
        }
    }

    public final zzgqm zzc() {
        for (zzgqm zzgqmVar : this.zza) {
            if (zzgqmVar != null && zzgqmVar.zzd()) {
                if (zzgqmVar.zzb() == zzgqf.zza) {
                    return zzgqmVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final int zzd() {
        return this.zza.size();
    }

    public final zzgqm zze(int i7) {
        if (i7 < 0 || i7 >= zzd()) {
            int iZzd = zzd();
            StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 34 + String.valueOf(iZzd).length());
            sb.append("Invalid index ");
            sb.append(i7);
            sb.append(" for keyset of size ");
            sb.append(iZzd);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        List list = this.zza;
        zzgqm zzgqmVar = (zzgqm) list.get(i7);
        if (!zzp(zzgqmVar.zzj())) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 42);
            sb2.append("Keyset-Entry at position ");
            sb2.append(i7);
            sb2.append(" has wrong status");
            throw new IllegalStateException(sb2.toString());
        }
        if (!zzgqmVar.zzi()) {
            return (zzgqm) list.get(i7);
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 48);
        sb3.append("Keyset-Entry at position ");
        sb3.append(i7);
        sb3.append(" didn't parse correctly");
        throw new IllegalStateException(sb3.toString());
    }

    public final Object zzg(zzgqb zzgqbVar, Class cls) throws GeneralSecurityException {
        if (!(zzgqbVar instanceof zzgxj)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzgxj zzgxjVar = (zzgxj) zzgqbVar;
        zzhec zzhecVarZzb = zzm().zzb();
        int i7 = zzgqv.zza;
        int iZza = zzhecVarZzb.zza();
        boolean z7 = true;
        int i8 = 0;
        boolean z8 = false;
        for (zzheb zzhebVar : zzhecVarZzb.zzb()) {
            if (zzhebVar.zzk() == 3) {
                if (!zzhebVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhebVar.zzc())));
                }
                if (zzhebVar.zzd() == zzhep.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhebVar.zzc())));
                }
                if (zzhebVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhebVar.zzc())));
                }
                if (zzhebVar.zzc() == iZza) {
                    if (z8) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z8 = true;
                }
                z7 &= zzhebVar.zzb().zzc() == zzhds.ASYMMETRIC_PUBLIC;
                i8++;
            }
        }
        if (i8 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z8 && !z7) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i9 = 0; i9 < zzd(); i9++) {
            List list = this.zza;
            if (((zzgqm) list.get(i9)).zzi() || !zzp(((zzgqm) list.get(i9)).zzj())) {
                String strZza = zzhecVarZzb.zzd(i9).zzb().zza();
                StringBuilder sb = new StringBuilder(String.valueOf(i9).length() + 44 + String.valueOf(strZza).length() + 32);
                sb.append("Key parsing of key with index ");
                sb.append(i9);
                sb.append(" and type_url ");
                sb.append(strZza);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgxjVar.zza(zzm(), this.zzb, cls);
    }

    private zzgqo(List list, zzgxy zzgxyVar, zzgqo zzgqoVar) {
        this.zza = list;
        this.zzb = zzgxyVar;
        this.zzc = zzgqoVar;
    }

    private zzgqo(zzhec zzhecVar, List list, zzgxy zzgxyVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzgxyVar;
        if (zzgxb.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzheb zzhebVar : zzhecVar.zzb()) {
                if (!hashSet.contains(Integer.valueOf(zzhebVar.zzc()))) {
                    hashSet.add(Integer.valueOf(zzhebVar.zzc()));
                } else {
                    int iZzc = zzhebVar.zzc();
                    StringBuilder sb = new StringBuilder(String.valueOf(iZzc).length() + 121);
                    sb.append("KeyID ");
                    sb.append(iZzc);
                    sb.append(" is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                    throw new GeneralSecurityException(sb.toString());
                }
            }
            if (!hashSet.contains(Integer.valueOf(zzhecVar.zza()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }
}
