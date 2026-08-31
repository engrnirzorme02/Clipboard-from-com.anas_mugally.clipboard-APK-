package p121P2;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: P2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1195b extends AbstractC3559g {
    private static final C3553a.g zza;
    private static final C3553a.a zzb;
    private static final C3553a zzc;

    static {
        C3553a.g gVar = new C3553a.g();
        zza = gVar;
        C1196c c1196c = new C1196c();
        zzb = c1196c;
        zzc = new C3553a("SmsRetriever.API", c1196c, gVar);
    }

    public AbstractC1195b(Activity activity) {
        super(activity, zzc, (C3553a.d) C3553a.d.f14527n, AbstractC3559g.a.f14540c);
    }

    public abstract Task startSmsRetriever();

    public AbstractC1195b(Context context) {
        super(context, zzc, C3553a.d.f14527n, AbstractC3559g.a.f14540c);
    }
}
