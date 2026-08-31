package p192Z3;

import com.google.android.gms.internal.p411firebaseauthapi.zzaif;
import com.google.firebase.auth.AbstractC4844b;

/* JADX INFO: renamed from: Z3.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2123f0 {

    /* JADX INFO: renamed from: a */
    private final int f6942a;

    /* JADX INFO: renamed from: b */
    private final String f6943b;

    /* JADX INFO: renamed from: c */
    private final String f6944c;

    /* JADX INFO: renamed from: d */
    private final AbstractC4844b f6945d;

    public C2123f0(zzaif zzaifVar) {
        int i7 = 5;
        this.f6943b = zzaifVar.zzg() ? zzaifVar.zzc() : zzaifVar.zzb();
        this.f6944c = zzaifVar.zzb();
        AbstractC4844b c2119d0 = null;
        if (!zzaifVar.zzh()) {
            this.f6942a = 3;
            this.f6945d = null;
            return;
        }
        String strZzd = zzaifVar.zzd();
        strZzd.getClass();
        switch (strZzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i7 = 6;
                break;
            case "PASSWORD_RESET":
                i7 = 0;
                break;
            case "VERIFY_EMAIL":
                i7 = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i7 = 4;
                break;
            case "RECOVER_EMAIL":
                i7 = 2;
                break;
            default:
                i7 = 3;
                break;
        }
        this.f6942a = i7;
        if (i7 == 4 || i7 == 3) {
            this.f6945d = null;
            return;
        }
        if (zzaifVar.zzf()) {
            c2119d0 = new C2125g0(zzaifVar.zzb(), AbstractC2089C.m8625a(zzaifVar.zza()));
        } else if (zzaifVar.zzg()) {
            c2119d0 = new C2121e0(zzaifVar.zzc(), zzaifVar.zzb());
        } else if (zzaifVar.zze()) {
            c2119d0 = new C2119d0(zzaifVar.zzb());
        }
        this.f6945d = c2119d0;
    }

    /* JADX INFO: renamed from: a */
    public final int m8703a() {
        return this.f6942a;
    }
}
