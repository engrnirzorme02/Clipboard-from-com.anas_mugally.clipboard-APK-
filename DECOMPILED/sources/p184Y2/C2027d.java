package p184Y2;

import android.content.Context;
import com.google.android.gms.common.api.AbstractC3559g;
import com.google.android.gms.common.api.C3553a;
import com.google.android.gms.common.api.internal.AbstractC3632w;
import com.google.android.gms.common.api.internal.InterfaceC3622r;
import com.google.android.gms.common.internal.C3726w;
import com.google.android.gms.common.internal.C3732z;
import com.google.android.gms.common.internal.InterfaceC3730y;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: Y2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2027d extends AbstractC3559g implements InterfaceC3730y {

    /* JADX INFO: renamed from: a */
    private static final C3553a.g f6715a;

    /* JADX INFO: renamed from: b */
    private static final C3553a.a f6716b;

    /* JADX INFO: renamed from: c */
    private static final C3553a f6717c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f6718d = 0;

    static {
        C3553a.g gVar = new C3553a.g();
        f6715a = gVar;
        C2026c c2026c = new C2026c();
        f6716b = c2026c;
        f6717c = new C3553a("ClientTelemetry.API", c2026c, gVar);
    }

    public C2027d(Context context, C3732z c3732z) {
        super(context, f6717c, c3732z, AbstractC3559g.a.f14540c);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3730y
    /* JADX INFO: renamed from: a */
    public final Task mo8435a(final C3726w c3726w) {
        AbstractC3632w.a aVarM17942a = AbstractC3632w.m17942a();
        aVarM17942a.m17950d(zaf.zaa);
        aVarM17942a.m17949c(false);
        aVarM17942a.m17948b(new InterfaceC3622r() { // from class: Y2.b
            @Override // com.google.android.gms.common.api.internal.InterfaceC3622r
            public final void accept(Object obj, Object obj2) {
                int i7 = C2027d.f6718d;
                ((C2024a) ((C2028e) obj).getService()).m8434L0(c3726w);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        });
        return doBestEffortWrite(aVarM17942a.m17947a());
    }
}
