package p355t1;

import com.anas_mugally.clipboard.p221ui.p222ai.models.ProcessingResultData;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: t1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7071b {

    /* JADX INFO: renamed from: t1.b$a */
    public static final class a extends AbstractC7071b {

        /* JADX INFO: renamed from: a */
        private final String f28233a;

        /* JADX INFO: renamed from: b */
        private final boolean f28234b;

        /* JADX INFO: renamed from: c */
        private final boolean f28235c;

        /* JADX INFO: renamed from: d */
        private final boolean f28236d;

        public /* synthetic */ a(String str, boolean z7, boolean z8, boolean z9, int i7, AbstractC6112h abstractC6112h) {
            this(str, (i7 & 2) != 0 ? false : z7, (i7 & 4) != 0 ? false : z8, (i7 & 8) != 0 ? false : z9);
        }

        /* JADX INFO: renamed from: a */
        public final String m31175a() {
            return this.f28233a;
        }

        /* JADX INFO: renamed from: b */
        public final boolean m31176b() {
            return this.f28234b;
        }

        /* JADX INFO: renamed from: c */
        public final boolean m31177c() {
            return this.f28236d;
        }

        /* JADX INFO: renamed from: d */
        public final boolean m31178d() {
            return this.f28235c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6118n.m27183a(this.f28233a, aVar.f28233a) && this.f28234b == aVar.f28234b && this.f28235c == aVar.f28235c && this.f28236d == aVar.f28236d;
        }

        public int hashCode() {
            return (((((this.f28233a.hashCode() * 31) + Boolean.hashCode(this.f28234b)) * 31) + Boolean.hashCode(this.f28235c)) * 31) + Boolean.hashCode(this.f28236d);
        }

        public String toString() {
            return "Error(message=" + this.f28233a + ", shouldRetry=" + this.f28234b + ", shouldUpgradeApp=" + this.f28235c + ", shouldUpdateRequired=" + this.f28236d + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String message, boolean z7, boolean z8, boolean z9) {
            super(null);
            AbstractC6118n.m27187e(message, "message");
            this.f28233a = message;
            this.f28234b = z7;
            this.f28235c = z8;
            this.f28236d = z9;
        }
    }

    /* JADX INFO: renamed from: t1.b$b */
    public static final class b extends AbstractC7071b {

        /* JADX INFO: renamed from: a */
        public static final b f28237a = new b();

        private b() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: t1.b$c */
    public static final class c extends AbstractC7071b {

        /* JADX INFO: renamed from: a */
        private final ProcessingResultData f28238a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ProcessingResultData data) {
            super(null);
            AbstractC6118n.m27187e(data, "data");
            this.f28238a = data;
        }

        /* JADX INFO: renamed from: a */
        public final ProcessingResultData m31179a() {
            return this.f28238a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC6118n.m27183a(this.f28238a, ((c) obj).f28238a);
        }

        public int hashCode() {
            return this.f28238a.hashCode();
        }

        public String toString() {
            return "Success(data=" + this.f28238a + ')';
        }
    }

    public /* synthetic */ AbstractC7071b(AbstractC6112h abstractC6112h) {
        this();
    }

    private AbstractC7071b() {
    }
}
