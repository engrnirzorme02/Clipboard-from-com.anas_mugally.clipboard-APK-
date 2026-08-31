package androidx.work;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p112O0.AbstractC1097j;

/* JADX INFO: renamed from: androidx.work.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2896b {

    /* JADX INFO: renamed from: b */
    private static final String f11883b = AbstractC1097j.m4846f("Data");

    /* JADX INFO: renamed from: c */
    public static final C2896b f11884c = new a().m14505a();

    /* JADX INFO: renamed from: a */
    Map f11885a;

    /* JADX INFO: renamed from: androidx.work.b$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private Map f11886a = new HashMap();

        /* JADX INFO: renamed from: a */
        public C2896b m14505a() throws Throwable {
            C2896b c2896b = new C2896b(this.f11886a);
            C2896b.m14501k(c2896b);
            return c2896b;
        }

        /* JADX INFO: renamed from: b */
        public a m14506b(String str, Object obj) {
            if (obj == null) {
                this.f11886a.put(str, null);
                return this;
            }
            Class<?> cls = obj.getClass();
            if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                this.f11886a.put(str, obj);
                return this;
            }
            if (cls == boolean[].class) {
                this.f11886a.put(str, C2896b.m14494a((boolean[]) obj));
                return this;
            }
            if (cls == byte[].class) {
                this.f11886a.put(str, C2896b.m14495b((byte[]) obj));
                return this;
            }
            if (cls == int[].class) {
                this.f11886a.put(str, C2896b.m14498e((int[]) obj));
                return this;
            }
            if (cls == long[].class) {
                this.f11886a.put(str, C2896b.m14499f((long[]) obj));
                return this;
            }
            if (cls == float[].class) {
                this.f11886a.put(str, C2896b.m14497d((float[]) obj));
                return this;
            }
            if (cls != double[].class) {
                throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
            }
            this.f11886a.put(str, C2896b.m14496c((double[]) obj));
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m14507c(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                m14506b((String) entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m14508d(String str, String str2) {
            this.f11886a.put(str, str2);
            return this;
        }
    }

    public C2896b(C2896b c2896b) {
        this.f11885a = new HashMap(c2896b.f11885a);
    }

    /* JADX INFO: renamed from: a */
    public static Boolean[] m14494a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i7 = 0; i7 < zArr.length; i7++) {
            boolArr[i7] = Boolean.valueOf(zArr[i7]);
        }
        return boolArr;
    }

    /* JADX INFO: renamed from: b */
    public static Byte[] m14495b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i7 = 0; i7 < bArr.length; i7++) {
            bArr2[i7] = Byte.valueOf(bArr[i7]);
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static Double[] m14496c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i7 = 0; i7 < dArr.length; i7++) {
            dArr2[i7] = Double.valueOf(dArr[i7]);
        }
        return dArr2;
    }

    /* JADX INFO: renamed from: d */
    public static Float[] m14497d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i7 = 0; i7 < fArr.length; i7++) {
            fArr2[i7] = Float.valueOf(fArr[i7]);
        }
        return fArr2;
    }

    /* JADX INFO: renamed from: e */
    public static Integer[] m14498e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i7 = 0; i7 < iArr.length; i7++) {
            numArr[i7] = Integer.valueOf(iArr[i7]);
        }
        return numArr;
    }

    /* JADX INFO: renamed from: f */
    public static Long[] m14499f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i7 = 0; i7 < jArr.length; i7++) {
            lArr[i7] = Long.valueOf(jArr[i7]);
        }
        return lArr;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static C2896b m14500g(byte[] bArr) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable e7;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i7 = objectInputStream.readInt(); i7 > 0; i7--) {
                            map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e8) {
                            Log.e(f11883b, "Error in Data#fromByteArray: ", e8);
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e9) {
                        e7 = e9;
                        Log.e(f11883b, "Error in Data#fromByteArray: ", e7);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e10) {
                                Log.e(f11883b, "Error in Data#fromByteArray: ", e10);
                            }
                        }
                        byteArrayInputStream.close();
                    } catch (ClassNotFoundException e11) {
                        e7 = e11;
                        Log.e(f11883b, "Error in Data#fromByteArray: ", e7);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                    }
                } catch (IOException e12) {
                    Log.e(f11883b, "Error in Data#fromByteArray: ", e12);
                }
            } catch (IOException e13) {
                e = e13;
                Throwable th = e;
                objectInputStream = null;
                e7 = th;
                Log.e(f11883b, "Error in Data#fromByteArray: ", e7);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new C2896b(map);
            } catch (ClassNotFoundException e14) {
                e = e14;
                Throwable th2 = e;
                objectInputStream = null;
                e7 = th2;
                Log.e(f11883b, "Error in Data#fromByteArray: ", e7);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new C2896b(map);
            } catch (Throwable th3) {
                th = th3;
                if (0 != 0) {
                    try {
                        objectInputStream2.close();
                    } catch (IOException e15) {
                        Log.e(f11883b, "Error in Data#fromByteArray: ", e15);
                    }
                }
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e16) {
                    Log.e(f11883b, "Error in Data#fromByteArray: ", e16);
                    throw th;
                }
            }
            return new C2896b(map);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m14501k(C2896b c2896b) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeInt(c2896b.m14504j());
                    for (Map.Entry entry : c2896b.f11885a.entrySet()) {
                        objectOutputStream2.writeUTF((String) entry.getKey());
                        objectOutputStream2.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (IOException e7) {
                        Log.e(f11883b, "Error in Data#toByteArray: ", e7);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e8) {
                        Log.e(f11883b, "Error in Data#toByteArray: ", e8);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e9) {
                    e = e9;
                    objectOutputStream = objectOutputStream2;
                    Log.e(f11883b, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e10) {
                            Log.e(f11883b, "Error in Data#toByteArray: ", e10);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        Log.e(f11883b, "Error in Data#toByteArray: ", e11);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e12) {
                            Log.e(f11883b, "Error in Data#toByteArray: ", e12);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e13) {
                        Log.e(f11883b, "Error in Data#toByteArray: ", e13);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e14) {
            e = e14;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2896b.class != obj.getClass()) {
            return false;
        }
        C2896b c2896b = (C2896b) obj;
        Set<String> setKeySet = this.f11885a.keySet();
        if (!setKeySet.equals(c2896b.f11885a.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f11885a.get(str);
            Object obj3 = c2896b.f11885a.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public Map m14502h() {
        return Collections.unmodifiableMap(this.f11885a);
    }

    public int hashCode() {
        return this.f11885a.hashCode() * 31;
    }

    /* JADX INFO: renamed from: i */
    public String m14503i(String str) {
        Object obj = this.f11885a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public int m14504j() {
        return this.f11885a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f11885a.isEmpty()) {
            for (String str : this.f11885a.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f11885a.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C2896b(Map map) {
        this.f11885a = new HashMap(map);
    }
}
