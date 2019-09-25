function openLayer( element, parant ){
    if( parent && parent != '' ){
        element.appendTo(parent);
    }  
    
    element.show();
}

function closeLayer( element ){
    $(element).hide();
}