package p129Q3;

import java.util.Map;
import p122P3.InterfaceC1201e;

/* JADX INFO: renamed from: Q3.q */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1278q {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Q3.q$a */
    private static abstract class a implements InterfaceC1201e {

        /* JADX INFO: renamed from: a */
        public static final a f4540a = new C7643a("KEY", 0);

        /* JADX INFO: renamed from: b */
        public static final a f4541b = new b("VALUE", 1);

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ a[] f4542c = m5594c();

        /* JADX INFO: renamed from: Q3.q$a$a, reason: collision with other inner class name */
        final enum C7643a extends a {
            C7643a(String str, int i7) {
                super(str, i7, null);
            }

            @Override // p122P3.InterfaceC1201e
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: Q3.q$a$b */
        final enum b extends a {
            b(String str, int i7) {
                super(str, i7, null);
            }

            @Override // p122P3.InterfaceC1201e
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private a(String str, int i7) {
            super(str, i7);
        }

        /* JADX INFO: renamed from: c */
        private static /* synthetic */ a[] m5594c() {
            return new a[]{f4540a, f4541b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f4542c.clone();
        }

        /* synthetic */ a(String str, int i7, AbstractC1277p abstractC1277p) {
            this(str, i7);
        }
    }

    /* JADX INFO: renamed from: a */
    static boolean m5591a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    static String m5592b(Map map) {
        StringBuilder sbM5510a = AbstractC1266e.m5510a(map.size());
        sbM5510a.append('{');
        boolean z7 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z7) {
                sbM5510a.append(", ");
            }
            sbM5510a.append(entry.getKey());
            sbM5510a.append('=');
            sbM5510a.append(entry.getValue());
            z7 = false;
        }
        sbM5510a.append('}');
        return sbM5510a.toString();
    }

    /* JADX INFO: renamed from: c */
    static InterfaceC1201e m5593c() {
        return a.f4541b;
    }
}
