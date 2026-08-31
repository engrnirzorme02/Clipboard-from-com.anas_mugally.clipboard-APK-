package p196a0;

import androidx.datastore.preferences.protobuf.C2535v;
import java.io.InputStream;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p174X.C1900d;

/* JADX INFO: renamed from: a0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2176d {

    /* JADX INFO: renamed from: a */
    public static final a f7043a = new a(null);

    /* JADX INFO: renamed from: a0.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2178f m8803a(InputStream input) throws C1900d {
            AbstractC6118n.m27187e(input, "input");
            try {
                C2178f c2178fM8810V = C2178f.m8810V(input);
                AbstractC6118n.m27186d(c2178fM8810V, "{\n                Prefer…From(input)\n            }");
                return c2178fM8810V;
            } catch (C2535v e7) {
                throw new C1900d("Unable to parse preferences proto.", e7);
            }
        }

        private a() {
        }
    }
}
