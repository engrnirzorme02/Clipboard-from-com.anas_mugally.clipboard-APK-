package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1638q;
import p230d6.AbstractC5245a;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5357b;
import p238e6.InterfaceC5358c;
import p238e6.InterfaceC5359d;
import p238e6.InterfaceC5360e;
import p238e6.InterfaceC5361f;
import p238e6.InterfaceC5362g;
import p238e6.InterfaceC5363h;
import p238e6.InterfaceC5364i;
import p238e6.InterfaceC5365j;
import p238e6.InterfaceC5366k;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5368m;
import p238e6.InterfaceC5369n;
import p238e6.InterfaceC5370o;
import p238e6.InterfaceC5371p;
import p238e6.InterfaceC5372q;
import p238e6.InterfaceC5373r;
import p238e6.InterfaceC5374s;
import p238e6.InterfaceC5375t;
import p238e6.InterfaceC5376u;
import p238e6.InterfaceC5377v;
import p238e6.InterfaceC5378w;
import p286k6.InterfaceC6077c;
import p302m6.AbstractC6406h;

/* JADX INFO: renamed from: kotlin.jvm.internal.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6110f implements InterfaceC6077c, InterfaceC6109e {

    /* JADX INFO: renamed from: b */
    public static final a f23874b = new a(null);

    /* JADX INFO: renamed from: c */
    private static final Map f23875c;

    /* JADX INFO: renamed from: d */
    private static final HashMap f23876d;

    /* JADX INFO: renamed from: e */
    private static final HashMap f23877e;

    /* JADX INFO: renamed from: f */
    private static final HashMap f23878f;

    /* JADX INFO: renamed from: r */
    private static final Map f23879r;

    /* JADX INFO: renamed from: a */
    private final Class f23880a;

    /* JADX INFO: renamed from: kotlin.jvm.internal.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final String m27177a(Class jClass) {
            String str;
            AbstractC6118n.m27187e(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) C6110f.f23878f.get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) C6110f.f23878f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX INFO: renamed from: b */
        public final String m27178b(Class jClass) {
            String str;
            AbstractC6118n.m27187e(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass()) {
                return null;
            }
            if (!jClass.isLocalClass()) {
                if (!jClass.isArray()) {
                    String str3 = (String) C6110f.f23879r.get(jClass.getName());
                    return str3 == null ? jClass.getSimpleName() : str3;
                }
                Class<?> componentType = jClass.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C6110f.f23879r.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "Array" : str2;
            }
            String simpleName = jClass.getSimpleName();
            Method enclosingMethod = jClass.getEnclosingMethod();
            if (enclosingMethod != null) {
                AbstractC6118n.m27184b(simpleName);
                String strN0 = AbstractC6406h.m27584N0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                if (strN0 != null) {
                    return strN0;
                }
            }
            Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
            if (enclosingConstructor == null) {
                AbstractC6118n.m27184b(simpleName);
                return AbstractC6406h.m27582M0(simpleName, '$', null, 2, null);
            }
            AbstractC6118n.m27184b(simpleName);
            return AbstractC6406h.m27584N0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
        }

        /* JADX INFO: renamed from: c */
        public final boolean m27179c(Object obj, Class jClass) {
            AbstractC6118n.m27187e(jClass, "jClass");
            Map map = C6110f.f23875c;
            AbstractC6118n.m27185c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(jClass);
            if (num != null) {
                return AbstractC6104G.m27166i(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = AbstractC5245a.m24242b(AbstractC5245a.m24243c(jClass));
            }
            return jClass.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        List listL = AbstractC1638q.m6767l(InterfaceC5356a.class, InterfaceC5367l.class, InterfaceC5371p.class, InterfaceC5372q.class, InterfaceC5373r.class, InterfaceC5374s.class, InterfaceC5375t.class, InterfaceC5376u.class, InterfaceC5377v.class, InterfaceC5378w.class, InterfaceC5357b.class, InterfaceC5358c.class, InterfaceC5359d.class, InterfaceC5360e.class, InterfaceC5361f.class, InterfaceC5362g.class, InterfaceC5363h.class, InterfaceC5364i.class, InterfaceC5365j.class, InterfaceC5366k.class, InterfaceC5368m.class, InterfaceC5369n.class, InterfaceC5370o.class);
        ArrayList arrayList = new ArrayList(AbstractC1638q.m6774s(listL, 10));
        int i7 = 0;
        for (Object obj : listL) {
            int i8 = i7 + 1;
            if (i7 < 0) {
                AbstractC1638q.m6773r();
            }
            arrayList.add(AbstractC1440r.m6083a((Class) obj, Integer.valueOf(i7)));
            i7 = i8;
        }
        f23875c = AbstractC1610H.m6634p(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f23876d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f23877e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        AbstractC6118n.m27186d(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            AbstractC6118n.m27184b(str);
            sb.append(AbstractC6406h.m27588P0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            C1435m c1435mM6083a = AbstractC1440r.m6083a(sb.toString(), str + ".Companion");
            map3.put(c1435mM6083a.m6070c(), c1435mM6083a.m6071d());
        }
        for (Map.Entry entry : f23875c.entrySet()) {
            map3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f23878f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1610H.m6623e(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            AbstractC6118n.m27184b(str2);
            linkedHashMap.put(key, AbstractC6406h.m27588P0(str2, '.', null, 2, null));
        }
        f23879r = linkedHashMap;
    }

    public C6110f(Class jClass) {
        AbstractC6118n.m27187e(jClass, "jClass");
        this.f23880a = jClass;
    }

    @Override // p286k6.InterfaceC6077c
    /* JADX INFO: renamed from: a */
    public String mo27114a() {
        return f23874b.m27177a(mo27173d());
    }

    @Override // p286k6.InterfaceC6077c
    /* JADX INFO: renamed from: b */
    public String mo27115b() {
        return f23874b.m27178b(mo27173d());
    }

    @Override // p286k6.InterfaceC6077c
    /* JADX INFO: renamed from: c */
    public boolean mo27116c(Object obj) {
        return f23874b.m27179c(obj, mo27173d());
    }

    @Override // kotlin.jvm.internal.InterfaceC6109e
    /* JADX INFO: renamed from: d */
    public Class mo27173d() {
        return this.f23880a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6110f) && AbstractC6118n.m27183a(AbstractC5245a.m24242b(this), AbstractC5245a.m24242b((InterfaceC6077c) obj));
    }

    public int hashCode() {
        return AbstractC5245a.m24242b(this).hashCode();
    }

    public String toString() {
        return mo27173d() + " (Kotlin reflection is not available)";
    }
}
