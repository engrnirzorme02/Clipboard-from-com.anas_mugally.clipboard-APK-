package androidx.privacysandbox.ads.adservices.measurement;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p173W5.InterfaceC1875e;
import p238e6.InterfaceC5367l;
import p346s0.C6943b;
import p346s0.C6944c;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2679b {

    /* JADX INFO: renamed from: a */
    public static final a f10631a = new a(null);

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.b$a */
    public static final class a {

        /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.measurement.b$a$a, reason: collision with other inner class name */
        static final class C7670a extends AbstractC6119o implements InterfaceC5367l {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Context f10632a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7670a(Context context) {
                super(1);
                this.f10632a = context;
            }

            @Override // p238e6.InterfaceC5367l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C2681d invoke(Context it) {
                AbstractC6118n.m27187e(it, "it");
                return new C2681d(this.f10632a);
            }
        }

        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC2679b m12783a(Context context) {
            AbstractC6118n.m27187e(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            C6943b c6943b = C6943b.f27895a;
            sb.append(c6943b.m30415a());
            Log.d("MeasurementManager", sb.toString());
            if (c6943b.m30415a() >= 5) {
                return new C2684g(context);
            }
            if (c6943b.m30416b() >= 9) {
                return (AbstractC2679b) C6944c.f27898a.m30419a(context, "MeasurementManager", new C7670a(context));
            }
            return null;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo12776a(AbstractC2678a abstractC2678a, InterfaceC1875e interfaceC1875e);

    /* JADX INFO: renamed from: b */
    public abstract Object mo12777b(InterfaceC1875e interfaceC1875e);

    /* JADX INFO: renamed from: c */
    public abstract Object mo12778c(Uri uri, InputEvent inputEvent, InterfaceC1875e interfaceC1875e);

    /* JADX INFO: renamed from: d */
    public abstract Object mo12779d(AbstractC2690m abstractC2690m, InterfaceC1875e interfaceC1875e);

    /* JADX INFO: renamed from: e */
    public abstract Object mo12780e(Uri uri, InterfaceC1875e interfaceC1875e);

    /* JADX INFO: renamed from: f */
    public abstract Object mo12781f(AbstractC2691n abstractC2691n, InterfaceC1875e interfaceC1875e);

    /* JADX INFO: renamed from: g */
    public abstract Object mo12782g(AbstractC2692o abstractC2692o, InterfaceC1875e interfaceC1875e);
}
