package p168W0;

import android.net.Uri;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import p112O0.C1090c;
import p112O0.EnumC1088a;
import p112O0.EnumC1098k;
import p112O0.EnumC1101n;
import p112O0.EnumC1106s;

/* JADX INFO: renamed from: W0.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1820v {

    /* JADX INFO: renamed from: W0.v$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5936a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f5937b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f5938c;

        /* JADX INFO: renamed from: d */
        static final /* synthetic */ int[] f5939d;

        static {
            int[] iArr = new int[EnumC1101n.values().length];
            f5939d = iArr;
            try {
                iArr[EnumC1101n.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5939d[EnumC1101n.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC1098k.values().length];
            f5938c = iArr2;
            try {
                iArr2[EnumC1098k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5938c[EnumC1098k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5938c[EnumC1098k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5938c[EnumC1098k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5938c[EnumC1098k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[EnumC1088a.values().length];
            f5937b = iArr3;
            try {
                iArr3[EnumC1088a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5937b[EnumC1088a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[EnumC1106s.values().length];
            f5936a = iArr4;
            try {
                iArr4[EnumC1106s.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5936a[EnumC1106s.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5936a[EnumC1106s.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f5936a[EnumC1106s.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f5936a[EnumC1106s.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f5936a[EnumC1106s.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m7562a(EnumC1088a enumC1088a) {
        int i7 = a.f5937b[enumC1088a.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + enumC1088a + " to int");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static C1090c m7563b(byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        IOException e7;
        C1090c c1090c = new C1090c();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ObjectInputStream objectInputStream2 = null;
            try {
                try {
                    try {
                        objectInputStream = new ObjectInputStream(byteArrayInputStream);
                        try {
                            for (int i7 = objectInputStream.readInt(); i7 > 0; i7--) {
                                c1090c.m4830a(Uri.parse(objectInputStream.readUTF()), objectInputStream.readBoolean());
                            }
                            try {
                                objectInputStream.close();
                            } catch (IOException e8) {
                                e8.printStackTrace();
                            }
                            byteArrayInputStream.close();
                        } catch (IOException e9) {
                            e7 = e9;
                            e7.printStackTrace();
                            if (objectInputStream != null) {
                                try {
                                    objectInputStream.close();
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                            }
                            byteArrayInputStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (0 != 0) {
                            try {
                                objectInputStream2.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        try {
                            byteArrayInputStream.close();
                            throw th;
                        } catch (IOException e12) {
                            e12.printStackTrace();
                            throw th;
                        }
                    }
                } catch (IOException e13) {
                    objectInputStream = null;
                    e7 = e13;
                } catch (Throwable th3) {
                    th = th3;
                    if (0 != 0) {
                        objectInputStream2.close();
                    }
                    byteArrayInputStream.close();
                    throw th;
                }
            } catch (IOException e14) {
                e14.printStackTrace();
            }
        }
        return c1090c;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m7564c(C1090c c1090c) throws Throwable {
        ObjectOutputStream objectOutputStream = null;
        if (c1090c.m4832c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream2.writeInt(c1090c.m4832c());
                        for (C1090c.a aVar : c1090c.m4831b()) {
                            objectOutputStream2.writeUTF(aVar.m4833a().toString());
                            objectOutputStream2.writeBoolean(aVar.m4834b());
                        }
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                        byteArrayOutputStream.close();
                    } catch (IOException e8) {
                        e = e8;
                        objectOutputStream = objectOutputStream2;
                        e.printStackTrace();
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                        byteArrayOutputStream.close();
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        if (objectOutputStream != null) {
                            try {
                                objectOutputStream.close();
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e11) {
                            e11.printStackTrace();
                            throw th;
                        }
                    }
                } catch (IOException e12) {
                    e = e12;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: d */
    public static EnumC1088a m7565d(int i7) {
        if (i7 == 0) {
            return EnumC1088a.EXPONENTIAL;
        }
        if (i7 == 1) {
            return EnumC1088a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to BackoffPolicy");
    }

    /* JADX INFO: renamed from: e */
    public static EnumC1098k m7566e(int i7) {
        if (i7 == 0) {
            return EnumC1098k.NOT_REQUIRED;
        }
        if (i7 == 1) {
            return EnumC1098k.CONNECTED;
        }
        if (i7 == 2) {
            return EnumC1098k.UNMETERED;
        }
        if (i7 == 3) {
            return EnumC1098k.NOT_ROAMING;
        }
        if (i7 == 4) {
            return EnumC1098k.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i7 == 5) {
            return EnumC1098k.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to NetworkType");
    }

    /* JADX INFO: renamed from: f */
    public static EnumC1101n m7567f(int i7) {
        if (i7 == 0) {
            return EnumC1101n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i7 == 1) {
            return EnumC1101n.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to OutOfQuotaPolicy");
    }

    /* JADX INFO: renamed from: g */
    public static EnumC1106s m7568g(int i7) {
        if (i7 == 0) {
            return EnumC1106s.ENQUEUED;
        }
        if (i7 == 1) {
            return EnumC1106s.RUNNING;
        }
        if (i7 == 2) {
            return EnumC1106s.SUCCEEDED;
        }
        if (i7 == 3) {
            return EnumC1106s.FAILED;
        }
        if (i7 == 4) {
            return EnumC1106s.BLOCKED;
        }
        if (i7 == 5) {
            return EnumC1106s.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i7 + " to State");
    }

    /* JADX INFO: renamed from: h */
    public static int m7569h(EnumC1098k enumC1098k) {
        int i7 = a.f5938c[enumC1098k.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        if (i7 == 3) {
            return 2;
        }
        if (i7 == 4) {
            return 3;
        }
        if (i7 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && enumC1098k == EnumC1098k.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + enumC1098k + " to int");
    }

    /* JADX INFO: renamed from: i */
    public static int m7570i(EnumC1101n enumC1101n) {
        int i7 = a.f5939d[enumC1101n.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + enumC1101n + " to int");
    }

    /* JADX INFO: renamed from: j */
    public static int m7571j(EnumC1106s enumC1106s) {
        switch (a.f5936a[enumC1106s.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + enumC1106s + " to int");
        }
    }
}
