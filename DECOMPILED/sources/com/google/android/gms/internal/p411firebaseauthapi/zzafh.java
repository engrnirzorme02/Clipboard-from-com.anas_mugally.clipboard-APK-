package com.google.android.gms.internal.p411firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.firebase.auth.AbstractC4854g;
import com.google.firebase.auth.C4823G;
import java.util.Objects;
import p192Z3.AbstractC2137o;
import p192Z3.InterfaceC2143u;

/* JADX INFO: loaded from: classes2.dex */
final class zzafh implements zzaem {
    final /* synthetic */ zzaff zza;

    zzafh(zzaff zzaffVar) {
        Objects.requireNonNull(zzaffVar);
        this.zza = zzaffVar;
    }

    private final void zza(zzafm zzafmVar) {
        this.zza.zzi.execute(new zzafn(this, zzafmVar));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zzb(String str) {
        int i7 = this.zza.zza;
        AbstractC3718s.m18087p(i7 == 8, "Unexpected response type " + i7);
        zza(new zzafj(this, str));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zzc(String str) {
        int i7 = this.zza.zza;
        AbstractC3718s.m18087p(i7 == 7, "Unexpected response type " + i7);
        zzaff.zza(this.zza);
    }

    private final void zza(Status status, AbstractC4854g abstractC4854g, String str, String str2) {
        zzaff.zza(this.zza, status);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzn = abstractC4854g;
        zzaffVar.zzo = str;
        zzaffVar.zzp = str2;
        InterfaceC2143u interfaceC2143u = zzaffVar.zzf;
        if (interfaceC2143u != null) {
            interfaceC2143u.zza(status);
        }
        this.zza.zza(status);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zzb() {
        int i7 = this.zza.zza;
        AbstractC3718s.m18087p(i7 == 6, "Unexpected response type " + i7);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zzc() {
        int i7 = this.zza.zza;
        AbstractC3718s.m18087p(i7 == 9, "Unexpected response type " + i7);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(String str) {
        int i7 = this.zza.zza;
        AbstractC3718s.m18087p(i7 == 8, "Unexpected response type " + i7);
        this.zza.zzu = true;
        zza(new zzafl(this, str));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzagv zzagvVar) {
        int i7 = this.zza.zza;
        AbstractC3718s.m18087p(i7 == 3, "Unexpected response type " + i7);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzl = zzagvVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza() {
        int i7 = this.zza.zza;
        AbstractC3718s.m18087p(i7 == 5, "Unexpected response type " + i7);
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzaap zzaapVar) {
        zza(zzaapVar.zza(), zzaapVar.zzb(), zzaapVar.zzc(), zzaapVar.zzd());
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzaas zzaasVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzq = zzaasVar;
        zzaffVar.zza(AbstractC2137o.m8742a("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(Status status, C4823G c4823g) {
        int i7 = this.zza.zza;
        AbstractC3718s.m18087p(i7 == 2, "Unexpected response type " + i7);
        zza(status, c4823g, null, null);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(Status status) {
        String strM17745V = status.m17745V();
        if (strM17745V != null) {
            if (strM17745V.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (strM17745V.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (strM17745V.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (strM17745V.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (strM17745V.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (strM17745V.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (strM17745V.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (strM17745V.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (strM17745V.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (strM17745V.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzaff zzaffVar = this.zza;
        if (zzaffVar.zza == 8) {
            zzaffVar.zzu = true;
            zza(new zzafk(this, status));
        } else {
            zzaff.zza(zzaffVar, status);
            this.zza.zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzahr zzahrVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzs = zzahrVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzahs zzahsVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzr = zzahsVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar, zzahk zzahkVar) {
        int i7 = this.zza.zza;
        AbstractC3718s.m18087p(i7 == 2, "Unexpected response type: " + i7);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzj = zzahvVar;
        zzaffVar.zzk = zzahkVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzaif zzaifVar) {
        int i7 = this.zza.zza;
        AbstractC3718s.m18087p(i7 == 4, "Unexpected response type " + i7);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzm = zzaifVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzaig zzaigVar) {
        zzaff.zza(this.zza);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzair zzairVar) {
        zzaff zzaffVar = this.zza;
        zzaffVar.zzt = zzairVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar) {
        int i7 = this.zza.zza;
        AbstractC3718s.m18087p(i7 == 1, "Unexpected response type: " + i7);
        zzaff zzaffVar = this.zza;
        zzaffVar.zzj = zzahvVar;
        zzaff.zza(zzaffVar);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(C4823G c4823g) {
        int i7 = this.zza.zza;
        AbstractC3718s.m18087p(i7 == 8, "Unexpected response type " + i7);
        this.zza.zzu = true;
        zza(new zzafi(this, c4823g));
    }
}
