package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.C3250D;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzawl extends zzaxl {
    private static final zzaxm zzh = new zzaxm();
    private final zzarp zzi;
    private final Context zzj;
    private final zzatr zzk;

    public zzawl(zzavx zzavxVar, String str, String str2, zzarw zzarwVar, int i7, int i8, Context context, zzari zzariVar, zzarp zzarpVar, zzatr zzatrVar) {
        super(zzavxVar, "yYlfo3JOLIfvdgBq3U3deu0pC6YiXdEdqGnVULE/KCllAkaO/XSsVQU+sKDN/uG0", "5ZNtOO3srzHnbl5PLlxEIuHlg0l+6HDun864hT7P5ko=", zzarwVar, i7, 27);
        this.zzj = context;
        this.zzi = zzarpVar;
        this.zzk = zzatrVar;
    }

    private final zzato zzc() {
        int iZzb;
        String str;
        if (((Boolean) C3250D.m17200c().zzd(zzbci.zzcY)).booleanValue()) {
            iZzb = ((Integer) C3250D.m17200c().zzd(zzbci.zzde)).intValue();
        } else {
            iZzb = this.zzi.zzb();
        }
        zzato zzatoVar = new zzato((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzatr zzatrVar = this.zzk;
        if (zzatrVar == null || zzatrVar.zza() == null) {
            str = "E";
        } else {
            try {
                str = (String) zzatrVar.zza().get(iZzb, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                str = "E";
            }
        }
        zzatoVar.zza = str;
        return zzatoVar;
    }

    private final String zzd() {
        try {
            zzavx zzavxVar = this.zza;
            if (zzavxVar.zzm() != null) {
                zzavxVar.zzm().get();
            }
            zzast zzastVarZzl = zzavxVar.zzl();
            if (zzastVarZzl == null || !zzastVarZzl.zza()) {
                return null;
            }
            return zzastVarZzl.zzb();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    protected final void zza() {
        int i7;
        zzato zzatoVarZzc;
        zzato zzatoVar;
        zzaxm zzaxmVar = zzh;
        Context context = this.zzj;
        AtomicReference atomicReferenceZza = zzaxmVar.zza(context.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                zzato zzatoVar2 = (zzato) atomicReferenceZza.get();
                if (zzatoVar2 == null || zzawa.zzc(zzatoVar2.zza) || zzatoVar2.zza.equals("E") || zzatoVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzawa.zzc(null)) {
                        zzawa.zzc(null);
                        i7 = 3;
                    } else {
                        i7 = 5;
                    }
                    if (this.zzk != null) {
                        zzatoVarZzc = zzc();
                    } else {
                        boolean z7 = false;
                        if (i7 == 3 && !this.zzi.zza()) {
                            z7 = true;
                        }
                        Boolean boolValueOf = Boolean.valueOf(z7);
                        Boolean bool = (Boolean) C3250D.m17200c().zzd(zzbci.zzcM);
                        String strZzb = ((Boolean) C3250D.m17200c().zzd(zzbci.zzcL)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzi() && zzawa.zzc(strZzb)) {
                            strZzb = zzd();
                        }
                        zzato zzatoVar3 = new zzato((String) this.zze.invoke(null, context, boolValueOf, strZzb));
                        if (zzawa.zzc(zzatoVar3.zza) || zzatoVar3.zza.equals("E")) {
                            int i8 = i7 - 1;
                            if (i8 == 3) {
                                String strZzd = zzd();
                                if (!zzawa.zzc(strZzd)) {
                                    zzatoVar3.zza = strZzd;
                                }
                            } else if (i8 == 4) {
                                throw null;
                            }
                        }
                        zzatoVarZzc = zzatoVar3;
                    }
                    atomicReferenceZza.set(zzatoVarZzc);
                }
                zzatoVar = (zzato) atomicReferenceZza.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        zzarw zzarwVar = this.zzd;
        synchronized (zzarwVar) {
            if (zzatoVar != null) {
                try {
                    zzarwVar.zzo(zzatoVar.zza);
                    zzarwVar.zzu(zzatoVar.zzb);
                    zzarwVar.zzt(zzatoVar.zzc);
                    zzarwVar.zzD(zzatoVar.zzd);
                    zzarwVar.zzE(zzatoVar.zze);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    protected final String zzb() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrZzb = zzawa.zzb((String) C3250D.m17200c().zzd(zzbci.zzcN));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzb)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzawa.zzb((String) C3250D.m17200c().zzd(zzbci.zzcO)))));
            }
            Context context = this.zzj;
            return zzaxo.zza(context, context.getPackageName(), arrayList, this.zza.zzd());
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
