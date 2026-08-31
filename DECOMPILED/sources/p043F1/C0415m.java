package p043F1;

import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p183Y1.AbstractC2023l;

/* JADX INFO: renamed from: F1.m */
/* JADX INFO: loaded from: classes.dex */
public class C0415m implements InterfaceC0413k {

    /* JADX INFO: renamed from: d */
    private static final Bitmap.Config[] f1647d;

    /* JADX INFO: renamed from: e */
    private static final Bitmap.Config[] f1648e;

    /* JADX INFO: renamed from: f */
    private static final Bitmap.Config[] f1649f;

    /* JADX INFO: renamed from: g */
    private static final Bitmap.Config[] f1650g;

    /* JADX INFO: renamed from: h */
    private static final Bitmap.Config[] f1651h;

    /* JADX INFO: renamed from: a */
    private final c f1652a = new c();

    /* JADX INFO: renamed from: b */
    private final C0409g f1653b = new C0409g();

    /* JADX INFO: renamed from: c */
    private final Map f1654c = new HashMap();

    /* JADX INFO: renamed from: F1.m$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f1655a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f1655a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1655a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1655a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1655a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: F1.m$b */
    static final class b implements InterfaceC0414l {

        /* JADX INFO: renamed from: a */
        private final c f1656a;

        /* JADX INFO: renamed from: b */
        int f1657b;

        /* JADX INFO: renamed from: c */
        private Bitmap.Config f1658c;

        public b(c cVar) {
            this.f1656a = cVar;
        }

        @Override // p043F1.InterfaceC0414l
        /* JADX INFO: renamed from: a */
        public void mo1773a() {
            this.f1656a.m1742c(this);
        }

        /* JADX INFO: renamed from: b */
        public void m1801b(int i7, Bitmap.Config config) {
            this.f1657b = i7;
            this.f1658c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f1657b == bVar.f1657b && AbstractC2023l.m8413d(this.f1658c, bVar.f1658c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i7 = this.f1657b * 31;
            Bitmap.Config config = this.f1658c;
            return i7 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C0415m.m1798h(this.f1657b, this.f1658c);
        }
    }

    /* JADX INFO: renamed from: F1.m$c */
    static class c extends AbstractC0405c {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p043F1.AbstractC0405c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b mo1740a() {
            return new b(this);
        }

        /* JADX INFO: renamed from: e */
        public b m1803e(int i7, Bitmap.Config config) {
            b bVar = (b) m1741b();
            bVar.m1801b(i7, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        f1647d = configArr;
        f1648e = configArr;
        f1649f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f1650g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f1651h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    /* JADX INFO: renamed from: f */
    private void m1796f(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapM1800j = m1800j(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapM1800j.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapM1800j.remove(num);
                return;
            } else {
                navigableMapM1800j.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + mo1795e(bitmap) + ", this: " + this);
    }

    /* JADX INFO: renamed from: g */
    private b m1797g(int i7, Bitmap.Config config) {
        b bVarM1803e = this.f1652a.m1803e(i7, config);
        for (Bitmap.Config config2 : m1799i(config)) {
            Integer num = (Integer) m1800j(config2).ceilingKey(Integer.valueOf(i7));
            if (num != null && num.intValue() <= i7 * 8) {
                if (num.intValue() == i7 && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f1652a.m1742c(bVarM1803e);
                return this.f1652a.m1803e(num.intValue(), config2);
            }
        }
        return bVarM1803e;
    }

    /* JADX INFO: renamed from: h */
    static String m1798h(int i7, Bitmap.Config config) {
        return "[" + i7 + "](" + config + ")";
    }

    /* JADX INFO: renamed from: i */
    private static Bitmap.Config[] m1799i(Bitmap.Config config) {
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            return f1648e;
        }
        int i7 = a.f1655a[config.ordinal()];
        if (i7 == 1) {
            return f1647d;
        }
        if (i7 == 2) {
            return f1649f;
        }
        if (i7 != 3) {
            return i7 != 4 ? new Bitmap.Config[]{config} : f1651h;
        }
        return f1650g;
    }

    /* JADX INFO: renamed from: j */
    private NavigableMap m1800j(Bitmap.Config config) {
        NavigableMap navigableMap = (NavigableMap) this.f1654c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f1654c.put(config, treeMap);
        return treeMap;
    }

    @Override // p043F1.InterfaceC0413k
    /* JADX INFO: renamed from: a */
    public String mo1791a(int i7, int i8, Bitmap.Config config) {
        return m1798h(AbstractC2023l.m8416g(i7, i8, config), config);
    }

    @Override // p043F1.InterfaceC0413k
    /* JADX INFO: renamed from: b */
    public int mo1792b(Bitmap bitmap) {
        return AbstractC2023l.m8417h(bitmap);
    }

    @Override // p043F1.InterfaceC0413k
    /* JADX INFO: renamed from: c */
    public void mo1793c(Bitmap bitmap) {
        b bVarM1803e = this.f1652a.m1803e(AbstractC2023l.m8417h(bitmap), bitmap.getConfig());
        this.f1653b.m1755d(bVarM1803e, bitmap);
        NavigableMap navigableMapM1800j = m1800j(bitmap.getConfig());
        Integer num = (Integer) navigableMapM1800j.get(Integer.valueOf(bVarM1803e.f1657b));
        navigableMapM1800j.put(Integer.valueOf(bVarM1803e.f1657b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // p043F1.InterfaceC0413k
    /* JADX INFO: renamed from: d */
    public Bitmap mo1794d(int i7, int i8, Bitmap.Config config) {
        b bVarM1797g = m1797g(AbstractC2023l.m8416g(i7, i8, config), config);
        Bitmap bitmap = (Bitmap) this.f1653b.m1754a(bVarM1797g);
        if (bitmap != null) {
            m1796f(Integer.valueOf(bVarM1797g.f1657b), bitmap);
            bitmap.reconfigure(i7, i8, config);
        }
        return bitmap;
    }

    @Override // p043F1.InterfaceC0413k
    /* JADX INFO: renamed from: e */
    public String mo1795e(Bitmap bitmap) {
        return m1798h(AbstractC2023l.m8417h(bitmap), bitmap.getConfig());
    }

    @Override // p043F1.InterfaceC0413k
    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f1653b.m1756f();
        if (bitmap != null) {
            m1796f(Integer.valueOf(AbstractC2023l.m8417h(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f1653b);
        sb.append(", sortedSizes=(");
        for (Map.Entry entry : this.f1654c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f1654c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
