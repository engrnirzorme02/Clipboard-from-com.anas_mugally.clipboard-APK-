package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import p104N.AbstractC0905b;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    static final PorterDuff.Mode f9296k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f9297a;

    /* JADX INFO: renamed from: b */
    Object f9298b;

    /* JADX INFO: renamed from: c */
    public byte[] f9299c;

    /* JADX INFO: renamed from: d */
    public Parcelable f9300d;

    /* JADX INFO: renamed from: e */
    public int f9301e;

    /* JADX INFO: renamed from: f */
    public int f9302f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f9303g;

    /* JADX INFO: renamed from: h */
    PorterDuff.Mode f9304h;

    /* JADX INFO: renamed from: i */
    public String f9305i;

    /* JADX INFO: renamed from: j */
    public String f9306j;

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$a */
    static class C2440a {
        /* JADX INFO: renamed from: a */
        static int m10615a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C2442c.m10621a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon resource", e7);
                return 0;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon resource", e9);
                return 0;
            }
        }

        /* JADX INFO: renamed from: b */
        static String m10616b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C2442c.m10622b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon package", e7);
                return null;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon package", e8);
                return null;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon package", e9);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        static int m10617c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C2442c.m10623c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e7);
                return -1;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e8);
                return -1;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e9);
                return -1;
            }
        }

        /* JADX INFO: renamed from: d */
        static Uri m10618d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C2442c.m10624d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e7) {
                Log.e("IconCompat", "Unable to get icon uri", e7);
                return null;
            } catch (NoSuchMethodException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            } catch (InvocationTargetException e9) {
                Log.e("IconCompat", "Unable to get icon uri", e9);
                return null;
            }
        }

        /* JADX INFO: renamed from: e */
        static Icon m10619e(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.f9297a) {
                case -1:
                    return (Icon) iconCompat.f9298b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f9298b);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.m10607f(), iconCompat.f9301e);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f9298b, iconCompat.f9301e, iconCompat.f9302f);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f9298b);
                    break;
                case 5:
                    iconCreateWithBitmap = C2441b.m10620a((Bitmap) iconCompat.f9298b);
                    break;
                case 6:
                    if (Build.VERSION.SDK_INT >= 30) {
                        iconCreateWithBitmap = C2443d.m10625a(iconCompat.m10609h());
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.m10609h());
                        }
                        InputStream inputStreamM10610i = iconCompat.m10610i(context);
                        if (inputStreamM10610i == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.m10609h());
                        }
                        iconCreateWithBitmap = C2441b.m10620a(BitmapFactory.decodeStream(inputStreamM10610i));
                    }
                    break;
            }
            ColorStateList colorStateList = iconCompat.f9303g;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f9304h;
            if (mode != IconCompat.f9296k) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$b */
    static class C2441b {
        /* JADX INFO: renamed from: a */
        static Icon m10620a(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$c */
    static class C2442c {
        /* JADX INFO: renamed from: a */
        static int m10621a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* JADX INFO: renamed from: b */
        static String m10622b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* JADX INFO: renamed from: c */
        static int m10623c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* JADX INFO: renamed from: d */
        static Uri m10624d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: renamed from: androidx.core.graphics.drawable.IconCompat$d */
    static class C2443d {
        /* JADX INFO: renamed from: a */
        static Icon m10625a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f9297a = -1;
        this.f9299c = null;
        this.f9300d = null;
        this.f9301e = 0;
        this.f9302f = 0;
        this.f9303g = null;
        this.f9304h = f9296k;
        this.f9305i = null;
    }

    /* JADX INFO: renamed from: a */
    static Bitmap m10601a(Bitmap bitmap, boolean z7) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f7 = iMin;
        float f8 = 0.5f * f7;
        float f9 = 0.9166667f * f8;
        if (z7) {
            float f10 = 0.010416667f * f7;
            paint.setColor(0);
            paint.setShadowLayer(f10, 0.0f, f7 * 0.020833334f, 1023410176);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.setShadowLayer(f10, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f8, f8, f9, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f8, f8, f9, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static IconCompat m10602b(Bitmap bitmap) {
        AbstractC0905b.m4127c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f9298b = bitmap;
        return iconCompat;
    }

    /* JADX INFO: renamed from: c */
    public static IconCompat m10603c(Resources resources, String str, int i7) {
        AbstractC0905b.m4127c(str);
        if (i7 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f9301e = i7;
        if (resources != null) {
            try {
                iconCompat.f9298b = resources.getResourceName(i7);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f9298b = str;
        }
        iconCompat.f9306j = str;
        return iconCompat;
    }

    /* JADX INFO: renamed from: n */
    private static String m10604n(int i7) {
        switch (i7) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX INFO: renamed from: d */
    public Bitmap m10605d() {
        int i7 = this.f9297a;
        if (i7 == -1) {
            Object obj = this.f9298b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i7 == 1) {
            return (Bitmap) this.f9298b;
        }
        if (i7 == 5) {
            return m10601a((Bitmap) this.f9298b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* JADX INFO: renamed from: e */
    public int m10606e() {
        int i7 = this.f9297a;
        if (i7 == -1) {
            return C2440a.m10615a(this.f9298b);
        }
        if (i7 == 2) {
            return this.f9301e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* JADX INFO: renamed from: f */
    public String m10607f() {
        int i7 = this.f9297a;
        if (i7 == -1) {
            return C2440a.m10616b(this.f9298b);
        }
        if (i7 == 2) {
            String str = this.f9306j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f9298b).split(":", -1)[0] : this.f9306j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* JADX INFO: renamed from: g */
    public int m10608g() {
        int i7 = this.f9297a;
        return i7 == -1 ? C2440a.m10617c(this.f9298b) : i7;
    }

    /* JADX INFO: renamed from: h */
    public Uri m10609h() {
        int i7 = this.f9297a;
        if (i7 == -1) {
            return C2440a.m10618d(this.f9298b);
        }
        if (i7 == 4 || i7 == 6) {
            return Uri.parse((String) this.f9298b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* JADX INFO: renamed from: i */
    public InputStream m10610i(Context context) {
        Uri uriM10609h = m10609h();
        String scheme = uriM10609h.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM10609h);
            } catch (Exception e7) {
                Log.w("IconCompat", "Unable to load image from URI: " + uriM10609h, e7);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f9298b));
        } catch (FileNotFoundException e8) {
            Log.w("IconCompat", "Unable to load image from path: " + uriM10609h, e8);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m10611j() {
        this.f9304h = PorterDuff.Mode.valueOf(this.f9305i);
        switch (this.f9297a) {
            case -1:
                Parcelable parcelable = this.f9300d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f9298b = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f9300d;
                if (parcelable2 != null) {
                    this.f9298b = parcelable2;
                    return;
                }
                byte[] bArr = this.f9299c;
                this.f9298b = bArr;
                this.f9297a = 3;
                this.f9301e = 0;
                this.f9302f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f9299c, Charset.forName("UTF-16"));
                this.f9298b = str;
                if (this.f9297a == 2 && this.f9306j == null) {
                    this.f9306j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f9298b = this.f9299c;
                return;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m10612k(boolean z7) {
        this.f9305i = this.f9304h.name();
        switch (this.f9297a) {
            case -1:
                if (z7) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.f9300d = (Parcelable) this.f9298b;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z7) {
                    this.f9300d = (Parcelable) this.f9298b;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f9298b;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.f9299c = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.f9299c = ((String) this.f9298b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f9299c = (byte[]) this.f9298b;
                return;
            case 4:
            case 6:
                this.f9299c = this.f9298b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    /* JADX INFO: renamed from: l */
    public Icon m10613l() {
        return m10614m(null);
    }

    /* JADX INFO: renamed from: m */
    public Icon m10614m(Context context) {
        return C2440a.m10619e(this, context);
    }

    public String toString() {
        if (this.f9297a == -1) {
            return String.valueOf(this.f9298b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(m10604n(this.f9297a));
        switch (this.f9297a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f9298b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f9298b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f9306j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(m10606e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f9301e);
                if (this.f9302f != 0) {
                    sb.append(" off=");
                    sb.append(this.f9302f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f9298b);
                break;
        }
        if (this.f9303g != null) {
            sb.append(" tint=");
            sb.append(this.f9303g);
        }
        if (this.f9304h != f9296k) {
            sb.append(" mode=");
            sb.append(this.f9304h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i7) {
        this.f9299c = null;
        this.f9300d = null;
        this.f9301e = 0;
        this.f9302f = 0;
        this.f9303g = null;
        this.f9304h = f9296k;
        this.f9305i = null;
        this.f9297a = i7;
    }
}
