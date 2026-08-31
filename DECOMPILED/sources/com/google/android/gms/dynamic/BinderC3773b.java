package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: com.google.android.gms.dynamic.b */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3773b extends InterfaceC3772a.a {

    /* JADX INFO: renamed from: a */
    private final Object f14922a;

    private BinderC3773b(Object obj) {
        this.f14922a = obj;
    }

    /* JADX INFO: renamed from: M0 */
    public static Object m18220M0(InterfaceC3772a interfaceC3772a) {
        if (interfaceC3772a instanceof BinderC3773b) {
            return ((BinderC3773b) interfaceC3772a).f14922a;
        }
        IBinder iBinderAsBinder = interfaceC3772a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i7 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i7++;
                field = field2;
            }
        }
        if (i7 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        AbstractC3718s.m18083l(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e7) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e7);
        } catch (NullPointerException e8) {
            throw new IllegalArgumentException("Binder object is null.", e8);
        }
    }

    /* JADX INFO: renamed from: N0 */
    public static InterfaceC3772a m18221N0(Object obj) {
        return new BinderC3773b(obj);
    }
}
