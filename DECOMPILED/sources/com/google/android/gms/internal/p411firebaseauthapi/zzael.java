package com.google.android.gms.internal.p411firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.firebase.auth.C4823G;
import p191Z2.C2086a;

/* JADX INFO: loaded from: classes2.dex */
public class zzael implements zzaem {
    private final zzaem zza;
    private final C2086a zzb;

    public zzael(zzael zzaelVar) {
        this(zzaelVar.zza, zzaelVar.zzb);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(String str) {
        try {
            this.zza.zza(str);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending auto retrieval timeout response.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public void zzb(String str) {
        try {
            this.zza.zzb(str);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending send verification code response.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zzc(String str) {
        try {
            this.zza.zzc(str);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending set account info response.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzagv zzagvVar) {
        try {
            this.zza.zza(zzagvVar);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending create auth uri response.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zzb() {
        try {
            this.zza.zzb();
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending email verification response.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zzc() {
        try {
            this.zza.zzc();
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when setting FirebaseUI Version", e7, new Object[0]);
        }
    }

    public zzael(zzaem zzaemVar, C2086a c2086a) {
        this.zza = (zzaem) AbstractC3718s.m18083l(zzaemVar);
        this.zzb = (C2086a) AbstractC3718s.m18083l(c2086a);
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza() {
        try {
            this.zza.zza();
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending delete account response.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzaap zzaapVar) {
        try {
            this.zza.zza(zzaapVar);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending failure result with credential", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzaas zzaasVar) {
        try {
            this.zza.zza(zzaasVar);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending failure result for mfa", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(Status status, C4823G c4823g) {
        try {
            this.zza.zza(status, c4823g);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending failure result.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public void zza(Status status) {
        try {
            this.zza.zza(status);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending failure result.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzahr zzahrVar) {
        try {
            this.zza.zza(zzahrVar);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending Play Integrity Producer project response.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzahs zzahsVar) {
        try {
            this.zza.zza(zzahsVar);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending get recaptcha config response.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar, zzahk zzahkVar) {
        try {
            this.zza.zza(zzahvVar, zzahkVar);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending get token and account info user response", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzaif zzaifVar) {
        try {
            this.zza.zza(zzaifVar);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending password reset response.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzaig zzaigVar) {
        try {
            this.zza.zza(zzaigVar);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending revoke token response.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzair zzairVar) {
        try {
            this.zza.zza(zzairVar);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending start mfa enrollment response.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(zzahv zzahvVar) {
        try {
            this.zza.zza(zzahvVar);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending token result.", e7, new Object[0]);
        }
    }

    @Override // com.google.android.gms.internal.p411firebaseauthapi.zzaem
    public final void zza(C4823G c4823g) {
        try {
            this.zza.zza(c4823g);
        } catch (RemoteException e7) {
            this.zzb.m8614b("RemoteException when sending verification completed response.", e7, new Object[0]);
        }
    }
}
