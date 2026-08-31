package com.google.gson.internal.bind;

import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.C5029h;
import com.google.gson.C5050k;
import com.google.gson.C5052m;
import com.google.gson.EnumC5054o;
import com.google.gson.InterfaceC5024c;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p359t5.InterfaceC7097b;
import p359t5.InterfaceC7098c;
import p367u5.AbstractC7165D;
import p367u5.AbstractC7166E;
import p367u5.AbstractC7168G;
import p367u5.AbstractC7191v;
import p367u5.C7189t;
import p367u5.C7190u;
import p367u5.InterfaceC7163B;
import p383w5.AbstractC7359a;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.internal.bind.k */
/* JADX INFO: loaded from: classes.dex */
public final class C5041k implements InterfaceC5060t {

    /* JADX INFO: renamed from: a */
    private final C7189t f19128a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5024c f19129b;

    /* JADX INFO: renamed from: c */
    private final C7190u f19130c;

    /* JADX INFO: renamed from: d */
    private final C5035e f19131d;

    /* JADX INFO: renamed from: e */
    private final List f19132e;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.k$a */
    class a extends AbstractC5059s {
        a() {
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: b */
        public Object mo22636b(C7415a c7415a) throws IOException {
            c7415a.m32829n1();
            return null;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: d */
        public void mo22637d(C7417c c7417c, Object obj) throws IOException {
            c7417c.mo22681R0();
        }

        public String toString() {
            return "AnonymousOrNonStaticLocalClassAdapter";
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.k$b */
    class b extends d {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f19134d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Method f19135e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ AbstractC5059s f19136f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ AbstractC5059s f19137g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ boolean f19138h;

        /* JADX INFO: renamed from: i */
        final /* synthetic */ boolean f19139i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Field field, boolean z7, Method method, AbstractC5059s abstractC5059s, AbstractC5059s abstractC5059s2, boolean z8, boolean z9) {
            super(str, field);
            this.f19134d = z7;
            this.f19135e = method;
            this.f19136f = abstractC5059s;
            this.f19137g = abstractC5059s2;
            this.f19138h = z8;
            this.f19139i = z9;
        }

        @Override // com.google.gson.internal.bind.C5041k.d
        /* JADX INFO: renamed from: a */
        void mo22711a(C7415a c7415a, int i7, Object[] objArr) {
            Object objMo22636b = this.f19137g.mo22636b(c7415a);
            if (objMo22636b != null || !this.f19138h) {
                objArr[i7] = objMo22636b;
                return;
            }
            throw new C5050k("null is not allowed as value for record component '" + this.f19144c + "' of primitive type; at path " + c7415a.m32831q0());
        }

        @Override // com.google.gson.internal.bind.C5041k.d
        /* JADX INFO: renamed from: b */
        void mo22712b(C7415a c7415a, Object obj) throws IllegalAccessException {
            Object objMo22636b = this.f19137g.mo22636b(c7415a);
            if (objMo22636b == null && this.f19138h) {
                return;
            }
            if (this.f19134d) {
                C5041k.m22705c(obj, this.f19143b);
            } else if (this.f19139i) {
                throw new C5029h("Cannot set value of 'static final' " + AbstractC7359a.m32400g(this.f19143b, false));
            }
            this.f19143b.set(obj, objMo22636b);
        }

        @Override // com.google.gson.internal.bind.C5041k.d
        /* JADX INFO: renamed from: c */
        void mo22713c(C7417c c7417c, Object obj) throws IllegalAccessException {
            Object objInvoke;
            if (this.f19134d) {
                Method method = this.f19135e;
                if (method == null) {
                    C5041k.m22705c(obj, this.f19143b);
                } else {
                    C5041k.m22705c(obj, method);
                }
            }
            Method method2 = this.f19135e;
            if (method2 != null) {
                try {
                    objInvoke = method2.invoke(obj, new Object[0]);
                } catch (InvocationTargetException e7) {
                    throw new C5029h("Accessor " + AbstractC7359a.m32400g(this.f19135e, false) + " threw exception", e7.getCause());
                }
            } else {
                objInvoke = this.f19143b.get(obj);
            }
            if (objInvoke == obj) {
                return;
            }
            c7417c.mo22680K0(this.f19142a);
            this.f19136f.mo22637d(c7417c, objInvoke);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.k$c */
    public static abstract class c extends AbstractC5059s {

        /* JADX INFO: renamed from: a */
        private final f f19141a;

        c(f fVar) {
            this.f19141a = fVar;
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: b */
        public Object mo22636b(C7415a c7415a) throws IOException {
            if (c7415a.m32824d1() == EnumC7416b.NULL) {
                c7415a.m32821Z0();
                return null;
            }
            Object objMo22714e = mo22714e();
            Map map = this.f19141a.f19147a;
            try {
                c7415a.m32828n();
                while (c7415a.m32812K0()) {
                    d dVar = (d) map.get(c7415a.m32820X0());
                    if (dVar == null) {
                        c7415a.m32829n1();
                    } else {
                        mo22716g(objMo22714e, c7415a, dVar);
                    }
                }
                c7415a.m32826k0();
                return mo22715f(objMo22714e);
            } catch (IllegalAccessException e7) {
                throw AbstractC7359a.m32398e(e7);
            } catch (IllegalStateException e8) {
                throw new C5052m(e8);
            }
        }

        @Override // com.google.gson.AbstractC5059s
        /* JADX INFO: renamed from: d */
        public void mo22637d(C7417c c7417c, Object obj) throws IOException {
            if (obj == null) {
                c7417c.mo22681R0();
                return;
            }
            c7417c.mo22679J();
            try {
                Iterator it = this.f19141a.f19148b.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).mo22713c(c7417c, obj);
                }
                c7417c.mo22690k0();
            } catch (IllegalAccessException e7) {
                throw AbstractC7359a.m32398e(e7);
            }
        }

        /* JADX INFO: renamed from: e */
        abstract Object mo22714e();

        /* JADX INFO: renamed from: f */
        abstract Object mo22715f(Object obj);

        /* JADX INFO: renamed from: g */
        abstract void mo22716g(Object obj, C7415a c7415a, d dVar);
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.k$d */
    static abstract class d {

        /* JADX INFO: renamed from: a */
        final String f19142a;

        /* JADX INFO: renamed from: b */
        final Field f19143b;

        /* JADX INFO: renamed from: c */
        final String f19144c;

        protected d(String str, Field field) {
            this.f19142a = str;
            this.f19143b = field;
            this.f19144c = field.getName();
        }

        /* JADX INFO: renamed from: a */
        abstract void mo22711a(C7415a c7415a, int i7, Object[] objArr);

        /* JADX INFO: renamed from: b */
        abstract void mo22712b(C7415a c7415a, Object obj);

        /* JADX INFO: renamed from: c */
        abstract void mo22713c(C7417c c7417c, Object obj);
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.k$e */
    private static final class e extends c {

        /* JADX INFO: renamed from: b */
        private final InterfaceC7163B f19145b;

        e(InterfaceC7163B interfaceC7163B, f fVar) {
            super(fVar);
            this.f19145b = interfaceC7163B;
        }

        @Override // com.google.gson.internal.bind.C5041k.c
        /* JADX INFO: renamed from: e */
        Object mo22714e() {
            return this.f19145b.mo31666a();
        }

        @Override // com.google.gson.internal.bind.C5041k.c
        /* JADX INFO: renamed from: f */
        Object mo22715f(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.C5041k.c
        /* JADX INFO: renamed from: g */
        void mo22716g(Object obj, C7415a c7415a, d dVar) {
            dVar.mo22712b(c7415a, obj);
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.k$f */
    private static class f {

        /* JADX INFO: renamed from: c */
        static final f f19146c = new f(Collections.EMPTY_MAP, Collections.EMPTY_LIST);

        /* JADX INFO: renamed from: a */
        final Map f19147a;

        /* JADX INFO: renamed from: b */
        final List f19148b;

        f(Map map, List list) {
            this.f19147a = map;
            this.f19148b = list;
        }
    }

    /* JADX INFO: renamed from: com.google.gson.internal.bind.k$g */
    private static final class g extends c {

        /* JADX INFO: renamed from: e */
        static final Map f19149e = m22717j();

        /* JADX INFO: renamed from: b */
        private final Constructor f19150b;

        /* JADX INFO: renamed from: c */
        private final Object[] f19151c;

        /* JADX INFO: renamed from: d */
        private final Map f19152d;

        g(Class cls, f fVar, boolean z7) {
            super(fVar);
            this.f19152d = new HashMap();
            Constructor constructorM32402i = AbstractC7359a.m32402i(cls);
            this.f19150b = constructorM32402i;
            if (z7) {
                C5041k.m22705c(null, constructorM32402i);
            } else {
                AbstractC7359a.m32408o(constructorM32402i);
            }
            String[] strArrM32404k = AbstractC7359a.m32404k(cls);
            for (int i7 = 0; i7 < strArrM32404k.length; i7++) {
                this.f19152d.put(strArrM32404k[i7], Integer.valueOf(i7));
            }
            Class<?>[] parameterTypes = this.f19150b.getParameterTypes();
            this.f19151c = new Object[parameterTypes.length];
            for (int i8 = 0; i8 < parameterTypes.length; i8++) {
                this.f19151c[i8] = f19149e.get(parameterTypes[i8]);
            }
        }

        /* JADX INFO: renamed from: j */
        private static Map m22717j() {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            return map;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.C5041k.c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Object[] mo22714e() {
            return (Object[]) this.f19151c.clone();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.C5041k.c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object mo22715f(Object[] objArr) {
            try {
                return this.f19150b.newInstance(objArr);
            } catch (IllegalAccessException e7) {
                throw AbstractC7359a.m32398e(e7);
            } catch (IllegalArgumentException e8) {
                e = e8;
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC7359a.m32396c(this.f19150b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e9) {
                e = e9;
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC7359a.m32396c(this.f19150b) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to invoke constructor '" + AbstractC7359a.m32396c(this.f19150b) + "' with args " + Arrays.toString(objArr), e10.getCause());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.gson.internal.bind.C5041k.c
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo22716g(Object[] objArr, C7415a c7415a, d dVar) {
            Integer num = (Integer) this.f19152d.get(dVar.f19144c);
            if (num != null) {
                dVar.mo22711a(c7415a, num.intValue(), objArr);
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC7359a.m32396c(this.f19150b) + "' for field with name '" + dVar.f19144c + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
    }

    public C5041k(C7189t c7189t, InterfaceC5024c interfaceC5024c, C7190u c7190u, C5035e c5035e, List list) {
        this.f19128a = c7189t;
        this.f19129b = interfaceC5024c;
        this.f19130c = c7190u;
        this.f19131d = c5035e;
        this.f19132e = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static void m22705c(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (AbstractC7166E.m31672a(accessibleObject, obj)) {
            return;
        }
        throw new C5029h(AbstractC7359a.m32400g(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    /* JADX INFO: renamed from: d */
    private d m22706d(C5026e c5026e, Field field, Method method, String str, C5058a c5058a, boolean z7, boolean z8) {
        AbstractC5059s c5043m;
        boolean zM31670a = AbstractC7165D.m31670a(c5058a.m22814c());
        int modifiers = field.getModifiers();
        boolean z9 = false;
        if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers)) {
            z9 = true;
        }
        InterfaceC7097b interfaceC7097b = (InterfaceC7097b) field.getAnnotation(InterfaceC7097b.class);
        AbstractC5059s abstractC5059sM22671d = interfaceC7097b != null ? this.f19131d.m22671d(this.f19128a, c5026e, c5058a, interfaceC7097b, false) : null;
        boolean z10 = abstractC5059sM22671d != null;
        if (abstractC5059sM22671d == null) {
            abstractC5059sM22671d = c5026e.m22624l(c5058a);
        }
        AbstractC5059s abstractC5059s = abstractC5059sM22671d;
        if (z7) {
            c5043m = z10 ? abstractC5059s : new C5043m(c5026e, abstractC5059s, c5058a.m22815d());
        } else {
            c5043m = abstractC5059s;
        }
        return new b(str, field, z8, method, c5043m, abstractC5059s, zM31670a, z9);
    }

    /* JADX INFO: renamed from: e */
    private static IllegalArgumentException m22707e(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC7359a.m32399f(field) + " and " + AbstractC7359a.m32399f(field2) + "\nSee " + AbstractC7168G.m31678a("duplicate-fields"));
    }

    /* JADX INFO: renamed from: f */
    private f m22708f(C5026e c5026e, C5058a c5058a, Class cls, boolean z7, boolean z8) {
        boolean z9;
        C5058a c5058a2;
        boolean z10;
        int i7;
        int i8;
        d dVar;
        if (cls.isInterface()) {
            return f.f19146c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C5058a c5058aM22810b = c5058a;
        boolean z11 = z7;
        Class clsM22814c = cls;
        while (clsM22814c != Object.class) {
            Field[] declaredFields = clsM22814c.getDeclaredFields();
            boolean z12 = true;
            boolean z13 = false;
            if (clsM22814c != cls && declaredFields.length > 0) {
                EnumC5054o enumC5054oM31673b = AbstractC7166E.m31673b(this.f19132e, clsM22814c);
                if (enumC5054oM31673b == EnumC5054o.BLOCK_ALL) {
                    throw new C5029h("ReflectionAccessFilter does not permit using reflection for " + clsM22814c + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z11 = enumC5054oM31673b == EnumC5054o.BLOCK_INACCESSIBLE;
            }
            boolean z14 = z11;
            int length = declaredFields.length;
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9;
                Field field = declaredFields[i10];
                boolean zM22710h = this.m22710h(field, z12);
                boolean zM22710h2 = this.m22710h(field, z13);
                if (zM22710h || zM22710h2) {
                    Method methodM32401h = null;
                    if (!z8) {
                        z9 = zM22710h2;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        z9 = z13;
                    } else {
                        methodM32401h = AbstractC7359a.m32401h(clsM22814c, field);
                        if (!z14) {
                            AbstractC7359a.m32408o(methodM32401h);
                        }
                        if (methodM32401h.getAnnotation(InterfaceC7098c.class) != null && field.getAnnotation(InterfaceC7098c.class) == null) {
                            throw new C5029h("@SerializedName on " + AbstractC7359a.m32400g(methodM32401h, z13) + " is not supported");
                        }
                        z9 = zM22710h2;
                    }
                    if (!z14 && methodM32401h == null) {
                        AbstractC7359a.m32408o(field);
                    }
                    Type typeM31734p = AbstractC7191v.m31734p(c5058aM22810b.m22815d(), clsM22814c, field.getGenericType());
                    List<String> listM22709g = this.m22709g(field);
                    c5058a2 = c5058aM22810b;
                    z10 = false;
                    String str = (String) listM22709g.get(0);
                    i7 = i10;
                    i8 = length;
                    d dVarM22706d = this.m22706d(c5026e, field, methodM32401h, str, C5058a.m22810b(typeM31734p), zM22710h, z14);
                    if (z9) {
                        for (String str2 : listM22709g) {
                            d dVar2 = (d) linkedHashMap.put(str2, dVarM22706d);
                            if (dVar2 != null) {
                                throw m22707e(cls, str2, dVar2.f19143b, field);
                            }
                        }
                    }
                    if (zM22710h && (dVar = (d) linkedHashMap2.put(str, dVarM22706d)) != null) {
                        throw m22707e(cls, str, dVar.f19143b, field);
                    }
                } else {
                    i8 = length;
                    i7 = i10;
                    c5058a2 = c5058aM22810b;
                    z10 = z13;
                }
                i9 = i7 + 1;
                this = this;
                z13 = z10;
                c5058aM22810b = c5058a2;
                length = i8;
                z12 = true;
            }
            c5058aM22810b = C5058a.m22810b(AbstractC7191v.m31734p(c5058aM22810b.m22815d(), clsM22814c, clsM22814c.getGenericSuperclass()));
            clsM22814c = c5058aM22810b.m22814c();
            z11 = z14;
        }
        return new f(linkedHashMap, new ArrayList(linkedHashMap2.values()));
    }

    /* JADX INFO: renamed from: g */
    private List m22709g(Field field) {
        String strMo22607d;
        List listM22608c;
        InterfaceC7098c interfaceC7098c = (InterfaceC7098c) field.getAnnotation(InterfaceC7098c.class);
        if (interfaceC7098c == null) {
            strMo22607d = this.f19129b.mo22607d(field);
            listM22608c = this.f19129b.m22608c(field);
        } else {
            String strValue = interfaceC7098c.value();
            List listAsList = Arrays.asList(interfaceC7098c.alternate());
            strMo22607d = strValue;
            listM22608c = listAsList;
        }
        if (listM22608c.isEmpty()) {
            return Collections.singletonList(strMo22607d);
        }
        ArrayList arrayList = new ArrayList(listM22608c.size() + 1);
        arrayList.add(strMo22607d);
        arrayList.addAll(listM22608c);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    private boolean m22710h(Field field, boolean z7) {
        return !this.f19130c.m31717d(field, z7);
    }

    @Override // com.google.gson.InterfaceC5060t
    /* JADX INFO: renamed from: a */
    public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
        Class clsM22814c = c5058a.m22814c();
        if (!Object.class.isAssignableFrom(clsM22814c)) {
            return null;
        }
        if (AbstractC7359a.m32405l(clsM22814c)) {
            return new a();
        }
        EnumC5054o enumC5054oM31673b = AbstractC7166E.m31673b(this.f19132e, clsM22814c);
        if (enumC5054oM31673b != EnumC5054o.BLOCK_ALL) {
            boolean z7 = enumC5054oM31673b == EnumC5054o.BLOCK_INACCESSIBLE;
            return AbstractC7359a.m32406m(clsM22814c) ? new g(clsM22814c, m22708f(c5026e, c5058a, clsM22814c, z7, true), z7) : new e(this.f19128a.m31710u(c5058a, true), m22708f(c5026e, c5058a, clsM22814c, z7, false));
        }
        throw new C5029h("ReflectionAccessFilter does not permit using reflection for " + clsM22814c + ". Register a TypeAdapter for this type or adjust the access filter.");
    }
}
