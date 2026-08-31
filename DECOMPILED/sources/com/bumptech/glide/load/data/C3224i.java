package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.i */
/* JADX INFO: loaded from: classes.dex */
public class C3224i extends AbstractC3227l {
    public C3224i(ContentResolver contentResolver, Uri uri, boolean z7) {
        super(contentResolver, uri, z7);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3219d
    /* JADX INFO: renamed from: a */
    public Class mo930a() {
        return ParcelFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC3227l
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo17105c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.data.AbstractC3227l
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo17106f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorM17130g = m17130g(uri);
        if (assetFileDescriptorM17130g != null) {
            return assetFileDescriptorM17130g.getParcelFileDescriptor();
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }
}
