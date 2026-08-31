package com.google.gson.internal.bind;

import com.google.gson.AbstractC5059s;
import com.google.gson.C5026e;
import com.google.gson.InterfaceC5060t;
import com.google.gson.reflect.C5058a;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p359t5.InterfaceC7098c;
import p391x5.C7415a;
import p391x5.C7417c;
import p391x5.EnumC7416b;

/* JADX INFO: renamed from: com.google.gson.internal.bind.d */
/* JADX INFO: loaded from: classes.dex */
class C5034d extends AbstractC5059s {

    /* JADX INFO: renamed from: d */
    static final InterfaceC5060t f19098d = new a();

    /* JADX INFO: renamed from: a */
    private final Map f19099a;

    /* JADX INFO: renamed from: b */
    private final Map f19100b;

    /* JADX INFO: renamed from: c */
    private final Map f19101c;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.d$a */
    class a implements InterfaceC5060t {
        a() {
        }

        @Override // com.google.gson.InterfaceC5060t
        /* JADX INFO: renamed from: a */
        public AbstractC5059s mo22659a(C5026e c5026e, C5058a c5058a) {
            Class clsM22814c = c5058a.m22814c();
            a aVar = null;
            if (!Enum.class.isAssignableFrom(clsM22814c) || clsM22814c == Enum.class) {
                return null;
            }
            if (!clsM22814c.isEnum()) {
                clsM22814c = clsM22814c.getSuperclass();
            }
            return new C5034d(clsM22814c, aVar);
        }
    }

    /* synthetic */ C5034d(Class cls, a aVar) {
        this(cls);
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Enum mo22636b(C7415a c7415a) throws IOException {
        if (c7415a.m32824d1() == EnumC7416b.NULL) {
            c7415a.m32821Z0();
            return null;
        }
        String strM32822b1 = c7415a.m32822b1();
        Enum r7 = (Enum) this.f19099a.get(strM32822b1);
        return r7 == null ? (Enum) this.f19100b.get(strM32822b1) : r7;
    }

    @Override // com.google.gson.AbstractC5059s
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22637d(C7417c c7417c, Enum r7) throws IOException {
        c7417c.mo22687f1(r7 == null ? null : (String) this.f19101c.get(r7));
    }

    private C5034d(Class cls) {
        this.f19099a = new HashMap();
        this.f19100b = new HashMap();
        this.f19101c = new HashMap();
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i7 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i7] = field;
                    i7++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i7);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r7 = (Enum) field2.get(null);
                String strName = r7.name();
                String string = r7.toString();
                InterfaceC7098c interfaceC7098c = (InterfaceC7098c) field2.getAnnotation(InterfaceC7098c.class);
                if (interfaceC7098c != null) {
                    strName = interfaceC7098c.value();
                    for (String str : interfaceC7098c.alternate()) {
                        this.f19099a.put(str, r7);
                    }
                }
                this.f19099a.put(strName, r7);
                this.f19100b.put(string, r7);
                this.f19101c.put(r7, strName);
            }
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        }
    }
}
