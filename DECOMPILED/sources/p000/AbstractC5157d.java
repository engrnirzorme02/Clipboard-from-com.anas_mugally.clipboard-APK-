package p000;

import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5157d {

    /* JADX INFO: renamed from: d$a */
    public static final class a extends AbstractC5157d {

        /* JADX INFO: renamed from: a */
        private final String f19734a;

        /* JADX INFO: renamed from: b */
        private final int f19735b;

        /* JADX INFO: renamed from: c */
        private final String f19736c;

        public /* synthetic */ a(String str, int i7, String str2, int i8, AbstractC6112h abstractC6112h) {
            this(str, i7, (i8 & 4) != 0 ? null : str2);
        }

        /* JADX INFO: renamed from: a */
        public final String m23906a() {
            return this.f19734a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC6118n.m27183a(this.f19734a, aVar.f19734a) && this.f19735b == aVar.f19735b && AbstractC6118n.m27183a(this.f19736c, aVar.f19736c);
        }

        public int hashCode() {
            int iHashCode = ((this.f19734a.hashCode() * 31) + Integer.hashCode(this.f19735b)) * 31;
            String str = this.f19736c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Error(message=" + this.f19734a + ", errorCode=" + this.f19735b + ", details=" + this.f19736c + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String message, int i7, String str) {
            super(null);
            AbstractC6118n.m27187e(message, "message");
            this.f19734a = message;
            this.f19735b = i7;
            this.f19736c = str;
        }
    }

    /* JADX INFO: renamed from: d$b */
    public static final class b extends AbstractC5157d {

        /* JADX INFO: renamed from: a */
        private final String f19737a;

        /* JADX INFO: renamed from: b */
        private final int f19738b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String data, int i7) {
            super(null);
            AbstractC6118n.m27187e(data, "data");
            this.f19737a = data;
            this.f19738b = i7;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6118n.m27183a(this.f19737a, bVar.f19737a) && this.f19738b == bVar.f19738b;
        }

        public int hashCode() {
            return (this.f19737a.hashCode() * 31) + Integer.hashCode(this.f19738b);
        }

        public String toString() {
            return "Success(data=" + this.f19737a + ", httpCode=" + this.f19738b + ')';
        }
    }

    public /* synthetic */ AbstractC5157d(AbstractC6112h abstractC6112h) {
        this();
    }

    private AbstractC5157d() {
    }
}
