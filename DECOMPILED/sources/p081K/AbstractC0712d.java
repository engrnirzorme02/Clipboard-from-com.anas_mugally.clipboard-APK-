package p081K;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1435m;

/* JADX INFO: renamed from: K.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0712d {
    /* JADX INFO: renamed from: a */
    public static final Bundle m3458a(C1435m... c1435mArr) {
        Bundle bundle = new Bundle(c1435mArr.length);
        for (C1435m c1435m : c1435mArr) {
            String str = (String) c1435m.m6068a();
            Object objM6069b = c1435m.m6069b();
            if (objM6069b == null) {
                bundle.putString(str, null);
            } else if (objM6069b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objM6069b).booleanValue());
            } else if (objM6069b instanceof Byte) {
                bundle.putByte(str, ((Number) objM6069b).byteValue());
            } else if (objM6069b instanceof Character) {
                bundle.putChar(str, ((Character) objM6069b).charValue());
            } else if (objM6069b instanceof Double) {
                bundle.putDouble(str, ((Number) objM6069b).doubleValue());
            } else if (objM6069b instanceof Float) {
                bundle.putFloat(str, ((Number) objM6069b).floatValue());
            } else if (objM6069b instanceof Integer) {
                bundle.putInt(str, ((Number) objM6069b).intValue());
            } else if (objM6069b instanceof Long) {
                bundle.putLong(str, ((Number) objM6069b).longValue());
            } else if (objM6069b instanceof Short) {
                bundle.putShort(str, ((Number) objM6069b).shortValue());
            } else if (objM6069b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objM6069b);
            } else if (objM6069b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objM6069b);
            } else if (objM6069b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objM6069b);
            } else if (objM6069b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objM6069b);
            } else if (objM6069b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objM6069b);
            } else if (objM6069b instanceof char[]) {
                bundle.putCharArray(str, (char[]) objM6069b);
            } else if (objM6069b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objM6069b);
            } else if (objM6069b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objM6069b);
            } else if (objM6069b instanceof int[]) {
                bundle.putIntArray(str, (int[]) objM6069b);
            } else if (objM6069b instanceof long[]) {
                bundle.putLongArray(str, (long[]) objM6069b);
            } else if (objM6069b instanceof short[]) {
                bundle.putShortArray(str, (short[]) objM6069b);
            } else if (objM6069b instanceof Object[]) {
                Class<?> componentType = objM6069b.getClass().getComponentType();
                AbstractC6118n.m27184b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    AbstractC6118n.m27185c(objM6069b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) objM6069b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    AbstractC6118n.m27185c(objM6069b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) objM6069b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    AbstractC6118n.m27185c(objM6069b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) objM6069b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) objM6069b);
                }
            } else if (objM6069b instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objM6069b);
            } else if (objM6069b instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objM6069b);
            } else if (objM6069b instanceof Size) {
                C0710b.m3454a(bundle, str, (Size) objM6069b);
            } else {
                if (!(objM6069b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objM6069b.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                C0710b.m3455b(bundle, str, (SizeF) objM6069b);
            }
        }
        return bundle;
    }
}
